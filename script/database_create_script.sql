use dmab0920_1086225;

--repeat until no more errors
declare @count int;
set @count = 1;
while @count <= 5
begin
	print @count;
	exec sp_MSforeachtable @command1 = "DROP TABLE ?";
	set @count = @count + 1;
end;
go

create table discount_group(
	id int primary key identity(1,1),
	type varchar(50) unique not null,
	discount int not null
);

create table contact_info(
	id int primary key identity(1,1),
	name varchar(50) unique not null,
	address varchar(50),
	phone_number varchar(9),
	email varchar(50),
	zipcode int,
	city varchar(50)
);

create table customer(
	id int primary key identity(1,1),
	customer_number int unique not null,
	discount_id int,
	contact_id int,
	constraint fk_customer_discount_id foreign key(discount_id) references discount_group(id),
	constraint fk_customer_contact_id foreign key(contact_id) references contact_info(id)
);

create table supplier(
	id int primary key identity(1,1),
	cvr int unique not null,
	contact_id int,
	constraint fk_supplier_contact_id foreign key(contact_id) references contact_info(id)
);

create table [order](
	id int primary key identity(1,1),
	order_number int unique not null,
	deal_date date,
	status varchar(50),
	price int,
	order_type varchar(30) not null,
	customer_id int,
	constraint fk_order_customer_id foreign key(customer_id) references customer(id)
);

create table invoice(
	id int primary key identity(1,1),
	invoice_number int unique not null,
	payment_date date,
	total_price int,
	order_id int,
	constraint fk_invoice_order_id foreign key(order_id) references [order](id)
);

create table rental_order(
	id int primary key,
	start_date date,
	end_date date,
	constraint fk_rental_order_id foreign key(id) references [order](id)
);

create table sale_order(
	id int primary key,
	delivery_status varchar(100),
	delivery_date date,
	constraint fk_sale_order_id foreign key(id) references [order](id)
);

create table product(
	id int primary key identity(1,1),
	ean int unique not null,
	name varchar(100),
	description varchar(300),
	purchase_price int,
	country_of_origin varchar(100),
	bought_date date,
	supplier_id int,
	type int,
	clothing_size int,
	clothing_color varchar(50),
	equipment_type varchar(100),
	gun_replica_cilbre int,
	gun_replica_material varchar(50),
	constraint fk_product_supplier_id foreign key(supplier_id) references supplier(id)
);

create table [location](
	id int primary key identity(1,1),
	name varchar(50) unique not null,
	address varchar(100),
	zipcode int
);

create table shelf(
	id int primary key identity(1,1),
	number int not null,
	location_id int not null,
	unique(number, location_id),
	constraint fk_shelf_location_id foreign key(location_id) references location(id)
);

create table rentable_product_copy(
	id int primary key identity(1,1),
	serial_number int unique not null,
	availability varchar(50),
	shelf_id int,
	product_id int,
	constraint fk_rentable_product_id foreign key(product_id) references product(id),
	constraint fk_rentable_shelf_id foreign key(shelf_id) references shelf(id)
);

create table sellable_product(
	id int primary key identity(1,1),
	product_id int unique not null,
	min_stock int,
	constraint fk_sellable_product_id foreign key(product_id) references product(id)
);

create table shelf_line(
	id int primary key identity(1,1),
	shelf_id int not null,
	product_id int not null,
	quantity int not null,
	level int not null,
	unique(shelf_id, product_id, level),
	constraint fk_shelfline_product_id foreign key(product_id) references sellable_product(id),
	constraint fk_shelfline_shelf_id foreign key(shelf_id) references shelf(id)
);

create table rental_connection(
	order_id int,
	product_id int,
	constraint fk_rental_connection_order_id foreign key(order_id) references [order](id),
	constraint fk_rental_connection_product_id foreign key(product_id) references product(id),
);

create table orderline(
	id int primary key identity(1,1),
	amount int,
	price int,
	order_id int,
	product_id int,
	unique(order_id, product_id),
	constraint fk_orderline_order_id foreign key(order_id) references [order](id),
	constraint fk_orderline_product_id foreign key(product_id) references product(id),
);

create table sale_price(
	amount int not null,
	start_date date,
	product_id int,
	primary key(start_date, product_id),
	constraint fk_price_product_id foreign key(product_id) references product(id)
);