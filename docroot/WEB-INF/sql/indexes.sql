create index IX_A4E6A050 on MeAssetCat (uuid_);
create index IX_BBB311D8 on MeAssetCat (uuid_, companyId);
create unique index IX_5E062E5A on MeAssetCat (uuid_, groupId);

create index IX_A2545918 on MeCategory (uuid_);
create index IX_B9CB8C10 on MeCategory (uuid_, companyId);
create unique index IX_CDE7D692 on MeCategory (uuid_, groupId);