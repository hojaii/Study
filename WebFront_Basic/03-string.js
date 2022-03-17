// String에 대한 이해
const s1 = "Modern JavaScript and Java";
const s2 = String("Modern JavaScript acnd Java");

console.log(typeof s1, typeof s2);
// 길이 확인: .length
console.log(s1, "Length:", s1.length);

// 문자열 추출 메서드
console.log(s1.charAt(7)); // 7번 인덱스의 문자
console.log(s1[7]); // 배열처럼 사용이 가능하지만 변경은 불가능함
console.log(s1.substring(7, 17)); // 문자열을 7번부터 17번 인덱스까지 출력
console.log(s1.substring(7)); // 7번 인덱스부터 끝까지 출력

// 검색 메서드 (중요)
// s1에서 문자열 Java를 검색
let position = s1.indexOf("Java"); // s1 에서 Java의 위치 검색
console.log(s1);
console.log("1번째 Java:", position);
position = s1.indexOf("Java", position + 4); // s1의 특정 위치로부터 검색
console.log("2번쨰 Java:", position);
position = s1.indexOf("Nothing"); // 없는 검색어의 검색
console.log("없는 검색어 :", position);
position = s1.lastIndexOf("Script"); // 뒤로부터 검색
console.log("뒤로부터 검색:", position);

// 문자열 치환
console.log(s1);
console.log(s1.replace("JavaScript", "JS")); // 원본이 변경되지않음
let s3 = s1.replace("JavaScript", "JS");
console.log(s1);

// 좌우 화이트 스페이스 제거
console.log("            Hello          ".trim()); // 좌우 공백 제거

// ES6의 Template String (중요)
// 이스케이프 -> 주의
// \n : 개행
// \t : 탭
// \' : 작은 따옴표
// \" : 큰따옴표
// \` : 백틱(ES6)
// \$ : 달러기호(ES6)

// 현재 기온는 00도 입니다 -> 문자열로
let temp = 12;
let message = "현재 기온은" + temp + "도 입니다";
console.log(message);

// 템플릿 문자열 활용
message = `현재 기온은 ${temp}도 입니다`;
console.log(message);

// 여러 줄 문자열도 템플릿 문자열로 쉽게 만들 수 있다
message = "예전에는 여러 줄 문자열을만드는것이 \n쉽지  않았습니다";
console.log(message);
message = `하지만 ES6에서는
아주 손쉽게
여러 줄 문자열을 만들 수 있습니다`;
console.log(message);