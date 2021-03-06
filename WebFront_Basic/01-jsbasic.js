// 한줄주석
/* 
    여러줄 주석
*/
// 터미널, 콘솔 메시지 출력을 위해서 console 객체를 이용
console.log("일반 메시지")
console.error("에러 메시지")
console.warn("경고 메시지")
console.info("정보 메시지")

// 변수 : var, le, const
var testVar = "var";    // ES6 이전 할당 방법
let testLet = "let";    // let : 재 할당 가능 변수
const testConst = "const"; // const: 재 할당 불가능 변수, 상수처럼 활용가능

// 변수의 변경
testVar = "var changed";
testLet = "let changed";
//testConst = "const changed";
// const는 선언과 동시에 할당하는 것만 가능함

let v = "String";
console.log(v, typeof v);   // 변수의 현재타입을 확인 : typeof
// 동적 타이핑 언어 -> 언제든지 타입이 변경될 수 있다.
v = 2022;
console.log(v, typeof v);

