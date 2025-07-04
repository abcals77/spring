// console.log(document.querySelector("#three").innerText);
// console.log(document.querySelectorAll(".red"));
// document.querySelectorAll("ul>li")[1].setAttribute("class","blue");

document.addEventListener("DOMContentLoaded", function(event){
  // 1) id 속성이 three인 태그의 text 속성
  let result = document.querySelector('#three').textContent;
  console.log(1, result);

  // 2) class 속성이 red인 태그들을 모두 출력
  document.querySelectorAll('.red').forEach( tag => { console.log(tag) });

  // 3) ul 태그의 자식 태그 중 두번째 태그의 class를 blue로 변경
  // document.querySelector('ul').children[1].className = 'blue';
  document.querySelector('ul').firstElementChild.nextElementSibling.className = 'blue';
  //                          첫번째 자식의 다음 형제 태그
  

})