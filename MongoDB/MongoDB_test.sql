db.restaurant.drop();
for (let i=1; i < 15; i++) {
    db.restaurant.insert({ _id : i, fname : 'food'+i, fprice : 1000 * i,
                fmaterial : ['A'+i, 'B'+i, 'C'+i], fcate : { type : 'T'+i, item : i} });
}

db.restaurant.find()

db.restaurant.find().sort({
    "fprice": -1
});

db.restaurant.find({},{
    "_id" : false,
    "fname" : true,
    "fprice": true
});

db.restaurant.find({
    "fprice":{ $gt : 8000}
});

db.restaurant.find({
    "fprice": { $gte : 3000, $lte : 10000}
});

db.restaurant.find({
    "fmaterial":{ $in : ["B4"]}
},{"_id": false,
   "fname": true
});

db.restaurant.find({
    "fprice": { $gte : 10000}
},{
    "_id" : false,
    "fcate" : true
});

db.restaurant.find({
    "fcate.item": { $lte: 10}
},{
    "_id": false,
    "fname": true,
    "fcate" : true
});

db.restaurant.updateOne({
    "fname": "food3"
},{ $set : {
    "fprice" : 13000,
    "fcate.type" : "TT3"
}});
db.restaurant.find().limit(5);

