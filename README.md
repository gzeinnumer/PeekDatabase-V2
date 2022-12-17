|<img src="/preview/preview1.png" width="300"/>|<img src="/preview/preview2.png" width="300"/>|<img src="/preview/preview3.png" width="300"/>|
|--|--|--|

<h1 align="center">
    PeekDatabase-V2
</h1>

<p align="center">
    <a><img src="https://img.shields.io/badge/Version-1.0.0-brightgreen.svg?style=flat"></a>
    <a><img src="https://img.shields.io/badge/ID-gzeinnumer-blue.svg?style=flat"></a>
    <a><img src="https://img.shields.io/badge/Java-Suport-green?logo=java&style=flat"></a>
    <a><img src="https://img.shields.io/badge/kotlin-Suport-green?logo=kotlin&style=flat"></a>
    <a href="https://github.com/gzeinnumer"><img src="https://img.shields.io/github/followers/gzeinnumer?label=follow&style=social"></a>
    <br>
    <p>Simple way to peek your DB Sql without third party app.</p>
</p>

---
# Content List
* [Download](#download)
* [Feature List](#feature-list)
* [Tech stack and 3rd library](#tech-stack-and-3rd-library)
* [Usage](#usage)
* [Example Code/App](#example-codeapp)
* [Version](#version)
* [Contribution](#contribution)

---
# Download
Add maven `jitpack.io` and `dependencies` in `build.gradle (Project)` :
```gradle
// build.gradle project
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}

// build.gradle app/module
dependencies {
  ...
  implementation 'com.github.gzeinnumer:PeekDatabase-V2:version'
}
```

---
# Feature List
- [x] [Show All Tables](#Show-All-Tables)
- [x] [Show Specific Tables](#Show-Specific-Tables)

---
# Tech stack and 3rd library
- [Sqlite](https://developer.android.com/jetpack/androidx/releases/sqlite)
- [Room](https://developer.android.com/training/data-storage/room?hl=id)
- [EasySQLiteCRUD](https://github.com/gzeinnumer/EasySQLiteCRUD)
- [EasyDialogFragment](https://github.com/gzeinnumer/EasyDialogFragment)
- [SimpleMaterialStyle](https://github.com/gzeinnumer/SimpleMaterialStyle)

---
# Usage

#
### Show All Tables

Show All table for sqlite
> **Java**
```java
//with sqlite
SQLiteDatabase sqLiteDatabase = DBInstance.getDataBase(getApplicationContext());
//with room
//SQLiteDatabase appDatabase = AppDatabase.getDatabase(getApplicationContext()).getSQLiteDB(getApplicationContext());

btn.setOnClickListener(view -> {
    DialogTableBuilder
            .newInstanse(this, sqLiteDatabase)
            .build();
});
```

```java
//spesial for Room
public SQLiteDatabase getSQLiteDB(Context context) {
    return SQLiteDatabase.openDatabase(context.getDatabasePath(dbName).getPath(),null,SQLiteDatabase.OPEN_READWRITE);
}
```

Show spesific
```java
DialogTableBuilder
    .newInstanse(this, sqLiteDatabase)
    .addTable("table1")
    .build();
```
```java
String[] tables = {
    "table1",
    "table2"
};
DialogTableBuilder
    .newInstanse(this, GblVariabel.myDb)
    .addTable(tables)
    .build();
```

---
# Example Code/App

[Sample Code](https://github.com/gzeinnumer/PeekDatabase-V2/blob/master/app/src/main/java/com/gzeinnumer/peekdatabase_v2/exampleSQLite/SqliteExampleActivity.java)

---
# Version
- **1.0.0**
  - First Release

---
# Contribution
You can sent your constibution to `branch` `open-pull`.

### Fore More [All My Library](https://github.com/gzeinnumer#my-library-list)

---

```
Copyright 2022 M. Fadli Zein
```
