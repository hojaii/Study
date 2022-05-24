var canvas =document.getElementById("canvas");
var ctx = canvas.getContext("2d");

canvas.width = window.innerWidth -100;
canvas.height = window.innerHeight -100;

// dino의 등장위치 선언
var dino = {
    x : 10,
    y : 200,
    width : 50,
    height : 50,
    // dino의 객체 정보
    draw(){
        ctx.fillStyle = "green";
        ctx.fillRect(this.x, this.y, this.width, this.height);
    }
}

// cactus의 객체 선언 & 정보
class Cactus{
    constructor(){
        this.x = 500;
        this.y = 200;
        this.width = 50;
        this.height = 50;
    }
    draw(){
        ctx.fillStyle="red";
        ctx.fillRect(this.x, this.y, this.width, this.height);
    }
}

// 시간 설정
var timer = 0;
var manycactust = [];


// 보이게될 화면
function everyframework(){
    requestAnimationFrame(everyframework);
    timer++;

    ctx.clearRect(0, 0, canvas.width, canvas.height);

    // 몇 프레임마다 cactus객체를 생성할지 조절
    if (timer % 120 ===0){ 
        var cactus = new Cactus();
        manycactust.push(cactus);
    }

    // cactus 객체의 x--방향이동 선언
    manycactust.forEach((a)=>{
        a.x--;
        a.draw();
    })

    // dino 객체의 x++ 방향이동 선언
    dino.x++;
    dino.draw()
}

// 보이게될 화면을 실행
everyframework();
