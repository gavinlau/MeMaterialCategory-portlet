create index IX_A4E6A050 on MeAssetCat (uuid_);
create index IX_BBB311D8 on MeAssetCat (uuid_, companyId);
create unique index IX_5E062E5A on MeAssetCat (uuid_, groupId);

create index IX_BEE05C0F on MeAssetCatCare (userId);
create index IX_9C0A3A44 on MeAssetCatCare (userId, assetCatId);
create index IX_5416D73F on MeAssetCatCare (uuid_);
create index IX_563E7F89 on MeAssetCatCare (uuid_, companyId);
create unique index IX_5343544B on MeAssetCatCare (uuid_, groupId);

create index IX_A2545918 on MeCategory (uuid_);
create index IX_B9CB8C10 on MeCategory (uuid_, companyId);
create unique index IX_CDE7D692 on MeCategory (uuid_, groupId);