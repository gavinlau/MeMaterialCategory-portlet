create table MeAssetCat (
	uuid_ VARCHAR(75) null,
	assetCatId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	status INTEGER,
	statusByUserId LONG,
	statusByUserName VARCHAR(75) null,
	statusDate DATE null,
	name VARCHAR(400) null,
	desc_ VARCHAR(400) null,
	useStatus INTEGER,
	code_ VARCHAR(400) null,
	mngId LONG,
	mngName LONG,
	codeAndName VARCHAR(400) null
);

create table MeAssetCatCare (
	uuid_ VARCHAR(75) null,
	assetCatCareId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	assetCatId LONG
);

create table MeCategory (
	uuid_ VARCHAR(75) null,
	catId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	status INTEGER,
	statusByUserId LONG,
	statusByUserName VARCHAR(75) null,
	statusDate DATE null,
	name VARCHAR(75) null,
	desc_ VARCHAR(75) null,
	remark VARCHAR(75) null,
	useStatus INTEGER,
	code_ VARCHAR(75) null,
	mngId LONG,
	mngName LONG,
	codeAndName VARCHAR(75) null,
	fullName VARCHAR(75) null,
	assetCatId LONG
);