use exercise_db;

db.createCollection("book");

db.book.insertOne({
    "name" : "python",
    "price" : 10000
});
db.book.insertOne({
    "name" : "java",
    "price" : 12000
});
db.book.insertOne({
    "name" : "javascript",
    "price" : 8000
});
db.book.insertOne({
    "name" : "html5",
    "price" : 8000
});
db.book.insertOne({
    "name" : "django",
    "price" : 20000
});
db.book.insertOne({
    "name" : "spark",
    "price" : 25000
});

// book collection의 데이터조회
db.book.find();

// 가격을 기준으로 오름차순 정렬
db.book.find().sort({
    "price" : 1
});

// 가격을 기준으로 내림차순 정렬
db.book.find().sort({
    "price" : -1
});

// 가격을 기준으로 내림차순 정렬후 2차정렬은 이름으로 오름차순 정렬
db.book.find().sort({
    "price" : -1,
    "name" : 1
});

// 이름이 javascript인 책의 정보 추출
db.book.find({
    "name" : "javascript"
});

// 제목이 java로 시작하는 모든 책 출력
db.book.find({
    "name" : { $regex : /java/}
});

// 가격이 8000원인 책 출력
db.book.find({
    "price" : 8000
});

// 가격이 8000원 초과인 책 출력
db.book.find({
    "price" : {$gt :8000}
});

// 가격이 8000원 이하인 책 출력
db.book.find({
    "price" : {$lte : 8000}
});

// 모든책을 출력하고 책의 이름만 출력
db.book.find({},{
    "_id" : false,
    "name" : true
});

// 책 가격이 10000 미만인 책의 이름과 가격만 출력
db.book.find({
    "price" : {$lt : 10000
}},
{
    "name": true,
    "price" : true,
    "_id" : false
});

// 책의 가격이 10000원 이상, 20000원 미만인 책의 이름과 가격을 출력
db.book.find({
    "price" : {$gte : 10000, $lt : 20000
}},
{
    "name": true,
    "price": true,
    "_id" : false
});

// 책 가격이 8000원 초과인 책의 개수 출력

db.book.count({
    "price" : { $gt: 8000 }
});

// JavaScript와 연계

let myCursor = db.book.find()
while(myCursor.hasNext()) {
    doc = myCursor.next()
    print("-----");
    print(doc);
}


// 새로운 collection에 데이터 입력
db.inventory.insertMany([
   {
        item: "journal",
        qty: 25,
        tags: ["blank", "red"],
        dim_cm: [ 14, 21 ]
   },
   {
        item: "notebook",
        qty: 50,
        tags: ["red", "blank"],
        dim_cm: [ 14, 21 ]
   },
   {
        item: "paper",
        qty: 100,
        tags: ["red", "blank", "plain"],
        dim_cm: [ 14, 21 ]
    },
   {
        item: "planner",
        qty: 75,
        tags: ["blank", "red"],
        dim_cm: [ 22.85, 30 ]
    },
   {
        item: "postcard",
        qty: 45,
        tags: ["blue"],
        dim_cm: [ 10, 15.25 ]
    }
]);

db.inventory.find();

// tags의 값이 ["red", "blank"] 인 document 추출
db.inventory.find({
    "tags" : { $in : ["red", "blank"]}
});

// tags의 값이 "red", "blank" 둘 다 포함하는 document 추출
db.inventory.find({
    $and: [{
        "tags" : "red"
    },{
        "tags" : "blank"
    }]
});
// tags의 값이 red인 document 추출(red를 포함하는)
db.inventory.find({
    "tags": { $in : ["red"]}
});

// dim_cm의 값이 25보다 큰 document 추출
db.inventory.find({
    "dim_cm" : { $gt : 25 }
});

// dim_cm의 값이 25보다 크고 30보다 같거나 작은 document 추출
db.inventory.find({
    "dim_cm" : { $gt : 25 , $lte : 30 }
});

// dim_cm의 두번째 원소 값이 16보다 큰 document 추출
db.inventory.find({
    "dim_cm.1" : {$gt : 16 }
});

// dim_cm의 첫번째 원소 값이 14인 document 추출
db.inventory.find({
    "dim_cm.0" : 14
});

// tags의 원소 개수가 3개인 document 추출
db.inventory.find({
    "tags" : { $size : 3 }
});

// 새로운 collection에 데이터 입력
db.inventory1.insertMany( [
   { item: "journal",
     qty: 25,
     size: { h: 14, w: 21, uom: "cm" },
     status: "A"
   },
   { item: "notebook",
     qty: 50,
     size: { h: 8.5, w: 11, uom: "in" },
     status: "A"
   },
   { item: "paper",
     qty: 100,
     size: { h: 8.5, w: 11, uom: "in" },
     status: "D"
   },
   { item: "planner",
     qty: 75,
     size: { h: 22.85, w: 30, uom: "cm" },
     status: "D"
   },
   { item: "postcard",
     qty: 45,
     size: { h: 10, w: 15.25, uom: "cm" },
     status: "A" }
]);

// 모든 document 조회
db.inventory1.find();

// size가 { h: 14, w: 21, uom: "cm" } 인 document 출력
db.inventory1.find({
    "size.h":14, "size.w":21, "size.uom":"cm"
});

// size의 uom이 in인 document 추출
db.inventory1.find({
    "size.uom": "in"
});

// size의 h값이 15 미만인 document 추출
db.inventory1.find({
    "size.h" : { $lt : 15 }
});

// size의 h값이 15 미만이고 size의 uom이 in이면서 status가 D인 document 추출
db.inventory1.find({
    "size.h" : { $lt : 15 }, "size.uom" : "in", "status" : "D"
});

// 새로운 collection에 데이터 입력
db.inventory2.insertMany( [
   { item: "journal",
     instock: [
                { warehouse: "A", qty: 5 },
                { warehouse: "C", qty: 15 }
              ]
   },
   { item: "notebook",
     instock: [
                { warehouse: "C", qty: 5 }
              ]
   },
   { item: "paper",
     instock: [
                { warehouse: "A", qty: 60 },
                { warehouse: "B", qty: 15 }
              ]
   },
   { item: "planner",
     instock: [
                { warehouse: "A", qty: 40 },
                { warehouse: "B", qty: 5 }
              ]
   },
   { item: "postcard",
     instock: [
                { warehouse: "B", qty: 15 },
                { warehouse: "C", qty: 35 }
              ]
   }
]);

db.inventory2.find();

// instock의 값에 { warehouse: "A", qty: 5 }를 가지고 있는 document 추출
db.inventory2.find({
    "instock" : { $elemMatch : {"warehouse" : "A", "qty": 5}}
});

// instock의 qty값이 20이하인 document 추출
db.inventory2.find({
    "instock" : { $elemMatch : { "qty" : { $lte : 20 }} }
});

// instock의 첫번째 요소의 qty값이 20 이하인 document 추출
db.inventory2.find({
    "instock.0.qty" : { $lte : 20  }
});
