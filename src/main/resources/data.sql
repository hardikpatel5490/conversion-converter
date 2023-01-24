-- insert into EXCHANGE_RATES (from_currency, to_currency, exchange_rate) values ('usd', 'inr', 80.78);
show tables;
insert into exchange_rates(id, from_currency,to_currency,exchange_rate) values(1, 'USD','INR',80.98);
insert into exchange_rates(id, from_currency,to_currency,exchange_rate) values(2, 'USD','CAN',1.34);
insert into exchange_rates(id, from_currency,to_currency,exchange_rate) values(3, 'USD','AUD',1.44);
insert into currencies(id, code,description) values(1, 'USD','American dollar');
insert into currencies(id, code,description) values(2, 'CAN','Canadian dollar');
