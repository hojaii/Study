const v1 = new Array(10); // 10개 짜리 빈 배열
const v2 = new Array(); // 빈 배열
const v3 = new Array(1, "ABC", true); // 어떤 객체든 들어갈 수 있다.

console.log(v1, v2, v3);
// length 속성 : 요소의 수
console.log(v1.length, v2.length, v3.length);

// 리터럴로 생성(추천)
const v4 = []; // 빈배열
const v5 = ["red", "green", "blue", "yellow"];

console.log(v4, v5);

// 객체도 배열처럼 접근할 수 있다.
const person ={
    name: "홍길동",
    age : 28
};

console.log(person["name"] + ":" + person["age"]);

// 자바 스크립트 배열은 인덱스를 엄격하게 체크하지 않음
const arr = [];
console.log(arr.length);
// 인덱스 범위를 벗어난 배열의 접근
arr[10] = 2022;
console.log(arr);
console.log(arr.length);

// 배열 합치기 concat
const verges = ["배추", "쪽파", "무"];
const sources = ["소금", "고추가루", "새우젓"];

console.log(verges, sources);

const ingr = verges.concat(sources);
console.log(ingr);

// join : 특정 문자열을 기준으로 합치기 -> string
console.log("김장재료", ingr.join(","));

// push, pop : 뒤쪽에서 요소 삽입, 추출
let fruits = ["Banana", "Orange", "Apple", "Mango"];
console.log(fruits);
fruits.push("Kiwi");    // 배열의 뒤에 요소 삽입
console.log(fruits);
console.log(fruits.pop());  // 배열의 뒤에서 요소 추출
console.log(fruits.pop());
console.log(fruits);    // 2개의 요소가 추출당함

// shift, push
fruits.push("pear");    // 맨뒤에 요소 추가
console.log(fruits);
console.log(fruits.shift());    // 배열의 앞에서 요소 추출
console.log(fruits.shift());
console.log(fruits.shift());
console.log(fruits);    // 3개의 요소가 추출당함

// splice : delete + insert
fruits = ["Banana", "Orange", "Apple", "Mango"];
// 인자의 갯수 1개 : 해당 인덱스 ~ 끝까지 추출한 후 제거
console.log(fruits);
console.log(fruits.splice(2));  // 2번인덱스 ~ 끝까지 추출후 제거
console.log(fruits);    // "Apple", "Mango"가 추출당함

fruits = ["Banana", "Orange", "Apple", "Mango"];
// 인자의 갯수 2개 : 시작인덱스, 갯수 추출 후 제거
console.log(fruits);
console.log(fruits.splice(2, 1));   // 2번인덱스 ~ 1개 추출후 제거
console.log(fruits);

fruits = ["Banana", "Orange", "Apple", "Mango"];
// 인자의 갯수 3개이상 : 시작인덱스, 갯수, 추가할 아이템들
console.log(fruits);
console.log(fruits.splice(2, 1, "Kiwi", "Pineapple"));
console.log(fruits);    // 2번인덱스 ~ 1개가 추출되고 "Kiwi", "Pineapple"이 추가

// reverse, slice
fruits.reverse();   //반전
console.log(fruits);
let slices = fruits.slice(1, 2);    // 1번인덱스 부터 2번인덱스까지 표기
console.log(slices);

// sort : 정렬 default는 오름차순정렬
console.log(fruits);
fruits.sort();  // 오름차순 정렬
console.log("Sort ASC :", fruits);
fruits.sort(function(v1, v2){
    if (v1 < v2) return 1;  // 양수라면 v1이 순서가 뒤
    if (v1 > v2) return -1; // 음수라면 v1이 순서가 앞
    if (v1 == v2) return 0; // 0이라면 순서가 같다
});
console.log("Sort DESC :", fruits);
