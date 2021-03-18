use dmab0920_1086225;

--Discount groups
insert into discount_group values('private', 100);
insert into discount_group values('business', 20);

--Contacts
insert into contact_info values ('China imports A/S', 'chua chuing', 20202020, 'ch-import@business.com', 76200, 'Beijing');
insert into contact_info values ('bent', 'hedegaarden 3', 29292929, 'bent&birte@hotmail.dk', 6200, 'Billund');
insert into contact_info values ('gitte', 'vejgade', 8888888, 'gitte-johansen@gmail.com', 2800, 'vejle');

--customers
insert into customer values(123456789, 1, 2);
insert into customer values(987654321, 1, 3);

--Suppliers
insert into supplier values(123456789, 1);

--products
insert into product values(23458967, 'genuine leather cowboy hat', 'A hat typically worn by cowboys', 20, 'texas', '2021-03-15', 1, 1, 30, 'brown', null, null, null);
insert into product values(11111111, 'genuine leather cowboy boots', 'boots worn by cowboys', 60, 'texas', '2021-03-14', 1, 1, 42, 'brown', null, null, null);
insert into product values(22222222, 'Cowboy clothing', 'Typical cowboy clothing', 30, 'texas', '2021-03-16', 1, 1, 40, 'red', null, null, null);
insert into product values(33333333, 'Denims', 'classic denim pants', 25, 'texas', '2021-03-15', 1, 1, 31, 'light blue', null, null, null);
insert into product values(44444444, 'T-shirts', 'standard t-shirts', 10, 'texas', '2021-03-15', 1, 1, 40, 'white', null, null, null);
insert into product values(55555555, 'Shirts', 'standard shirts', 10, 'texas', '2021-03-15', 1, 1, 40, 'grey', null, null, null);
insert into product values(66666666, 'Ponchos', 'bil ol'' ponchos', 10, 'texas', '2021-03-15', 1, 1, 40, 'green/brown', null, null, null);
insert into product values(77777777, 'Vests', 'a nice cowboy vests', 10, 'texas', '2020-03-15', 1, 1, 30, 'black', null, null, null);
insert into product values(88888888, 'Leather Jackets', 'dope leather jackets for everyone', 200, 'texas', '2020-03-15', 1, 1, 35, 'dark brown', null, null, null);
insert into product values(99999999, 'Dresses', 'A hat typically worn by cowboys', 10, 'texas', '2021-03-15', 1, 2, null, null, 'hat', null, null);
insert into product values(10101010, 'Skirts', 'A hat typically worn by cowboys', 10, 'texas', '2021-03-15', 1, 2, null, null, 'hat', null, null);
insert into product values(12121212, 'Oilskin Jackets', 'A hat typically worn by cowboys', 10, 'texas', '2021-03-15', 1, 2, null, null, 'hat', null, null);
insert into product values(13131313, 'Chaps', 'A hat typically worn by cowboys', 10, 'texas', '2021-03-15', 1, 2, null, null, 'hat', null, null);
insert into product values(14141414, 'Overalls', 'A hat typically worn by cowboys', 10, 'texas', '2021-03-15', 1, 2, null, null, 'hat', null, null);
insert into product values(15151515, 'Ties', 'A hat typically worn by cowboys', 10, 'texas', '2021-03-15', 1, 2, null, null, 'hat', null, null);
insert into product values(16161616, 'Earrings', 'A hat typically worn by cowboys', 10, 'texas', '2021-03-15', 1, 2, null, null, 'hat', null, null);
insert into product values(17171717, 'Necklaces', 'A hat typically worn by cowboys', 10, 'texas', '2021-03-15', 1, 2, null, null, 'hat', null, null);
insert into product values(18181818, 'Belts and buckles', 'A hat typically worn by cowboys', 10, 'texas', '2021-03-15', 1, 2, null, null, 'hat', null, null);
insert into product values(19191919, 'Pistol Belts', 'A hat typically worn by cowboys', 10, 'texas', '2021-03-15', 1, 2, null, null, 'hat', null, null);
insert into product values(20202020, 'Shotgun', 'a nice shotgun for killin''', 1000, 'texas', '2021-03-15', 1, 3, null, null, null, 8, 'wood/metal');
insert into product values(20202021, 'Gun', 'A hat typically worn by cowboys', 10, 'texas', '2021-03-15', 1, 3, null, null, null, 3, 'wood/metal');
insert into product values(21212121, 'Sheriff uniforms and equipment', 'A hat typically worn by cowboys', 10, 'texas', '2021-03-15', 1, 2, null, null, 'hat', null, null);
insert into product values(23232323, 'Jewellery', 'A hat typically worn by cowboys', 10, 'texas', '2021-03-15', 1, 2, null, null, 'hat', null, null);
insert into product values(24242424, 'Scarves', 'A hat typically worn by cowboys', 10, 'texas', '2021-03-15', 1, 2, null, null, 'hat', null, null);
insert into product values(25252525, 'Decorations', 'A hat typically worn by cowboys', 10, 'texas', '2021-03-15', 1, 2, null, null, 'hat', null, null);
insert into product values(26262626, 'Flags', 'A hat typically worn by cowboys', 10, 'texas', '2021-03-15', 1, 2, null, null, 'hat', null, null);
insert into product values(27272727, 'Personalized Licence Plates', 'A hat typically worn by cowboys', 10, 'texas', '2021-03-15', 1, 2, null, null, 'hat', null, null);
insert into product values(28282828, 'Zippo Lighters', 'A hat typically worn by cowboys', 10, 'texas', '2021-03-15', 1, 2, null, null, 'hat', null, null);
insert into product values(29292929, 'Money Clips', 'A hat typically worn by cowboys', 10, 'texas', '2021-03-15', 1, 2, null, null, 'hat', null, null);
insert into product values(30303030, 'Bags', 'A hat typically worn by cowboys', 10, 'texas', '2021-03-15', 1, 2, null, null, 'hat', null, null);
insert into product values(31313131, 'Western and Country music CDs', 'A hat typically worn by cowboys', 10, 'texas', '2021-03-15', 1, 2, null, null, 'hat', null, null);

--locations (warehouses/shops)
insert into location values('primary warehouse', 'localcityname', 8520);
insert into location values('secondary warehouse', 'langbortistan', 4690);

--shelfs
declare @count int;
set @count = 1;
while @count <= 20
begin
	insert into shelf values(@count, 1);
	insert into shelf values(@count, 2);
	set @count = @count + 1;
end;
go

--rentables
insert into rentable_product_copy values(234663, 'available', 1, 1);
insert into rentable_product_copy values(9823742, 'unavailable', 1, 2);
insert into rentable_product_copy values(92356, 'available', 1, 5);
insert into rentable_product_copy values(234763873, 'unavailable', 1, 7);
insert into rentable_product_copy values(23524, 'available', 2, 4);
insert into rentable_product_copy values(98463, 'unavailable', 2, 5);
insert into rentable_product_copy values(2345247, 'available', 2, 8);
insert into rentable_product_copy values(967538, 'unavailable', 2, 12);

--sellables
insert into sellable_product values(1, 20);
insert into sellable_product values(2, 52);
insert into sellable_product values(3, 75);
insert into sellable_product values(4, 20);
insert into sellable_product values(5, 12);
insert into sellable_product values(6, 23);
insert into sellable_product values(7, 85);
insert into sellable_product values(8, 45);
insert into sellable_product values(9, 97);
insert into sellable_product values(10, 23);
insert into sellable_product values(11, 57);
insert into sellable_product values(12, 56);
insert into sellable_product values(13, 578);
insert into sellable_product values(14, 24);
insert into sellable_product values(15, 76);
insert into sellable_product values(16, 10);

--shelf items
insert into shelf_line values(1, 1, 20, 1);
insert into shelf_line values(1, 2, 234, 2);
insert into shelf_line values(1, 3, 4234, 3);
insert into shelf_line values(2, 4, 2023, 1);
insert into shelf_line values(2, 5, 34243, 2);
insert into shelf_line values(2, 6, 243, 3);
insert into shelf_line values(3, 7, 243, 1);
insert into shelf_line values(3, 8, 234, 2);
insert into shelf_line values(3, 9, 678, 3);
insert into shelf_line values(4, 10, 678, 1);
insert into shelf_line values(4, 11, 967, 2);
insert into shelf_line values(4, 12, 123, 3);
insert into shelf_line values(5, 13, 675, 1);
insert into shelf_line values(5, 14, 423, 2);
insert into shelf_line values(5, 15, 75, 3);
insert into shelf_line values(6, 16, 2354, 1);

--price history
insert into sale_price values(20, '2021-03-19', 1);
insert into sale_price values(10, '2021-03-16', 1);
insert into sale_price values(54, '2021-03-18', 1);
insert into sale_price values(58, '2021-03-12', 3);
insert into sale_price values(35, '2021-03-11', 4);
insert into sale_price values(54, '2021-03-15', 5);
insert into sale_price values(97, '2021-03-18', 6);
insert into sale_price values(23, '2021-03-19', 7);
insert into sale_price values(07, '2021-03-13', 8);
insert into sale_price values(654, '2021-03-18', 9);
insert into sale_price values(34, '2021-03-13', 10);
insert into sale_price values(76, '2021-03-14', 11);
insert into sale_price values(45, '2021-03-16', 12);
insert into sale_price values(86, '2021-03-15', 13);
insert into sale_price values(29, '2021-03-17', 14);
insert into sale_price values(49, '2021-03-18', 15);
insert into sale_price values(26, '2021-03-19', 16);
insert into sale_price values(589, '2021-03-12', 17);
insert into sale_price values(45, '2021-03-13', 18);
insert into sale_price values(65, '2021-03-11', 19);