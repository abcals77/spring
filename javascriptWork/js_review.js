// Javascript Review
// DOM API
// 1) 태그를 탐색 및 조작
// 2) Event Handling
// AJAX -> fetch 함수

/*
  -- 메소드 + Selector
  document.querySelector()
  document.queryselectorAll()
  
  -- css Selector
  id 속성 : #
  class 속성 : .
  태그 : tag
  일반속성 : [속성 = 값] ex) [ name = "employeeId" ]
*/  

document.querySelectorAll('div li.red')
        .forEach(tag => console.log(tag));

let tag = document.querySelectorAll('li [name="city"]');
console.log('예시1', tag);
tag = document.querySelectorAll('li[name="city"]');
console.log('예시2', tag);

// Array.from(tag.keys()).forEach(key => console.log(key));
// console.log(tag);

tag = document.querySelector('.red');
tag.className += ' selected';
tag.classList.remove('red');
tag.classList.add('blue');
console.log(tag);

// 이벤트 처리
document.querySelector('ul')
        .addEventListener('click', function(event){
          // 이벤트 핸들러 -> 매개변수로 이벤트 객체가 넘어옴
          // 1) 필드
          // event.target
          // event.currentTarget : 현재 이벤트 핸들러가 동작하는 태그(유동)
          // 2) 메서드
          // event.stopPropagation(); : 이벤트 버블링을 멈춤
          // event.preventDefault();  : 기본 이벤트 핸들러를 일시정지
          let selectTag = event.currentTarget;
          // if(event.target.tagName=='P')
            selectTag.style.backgroundColor = 'CadetBlue';
          
        });

document.querySelectorAll('li.red')
        .forEach(liTag => {
          liTag.addEventListener('click', function(event){
            event.stopPropagation();
            console.log('li.red click event!');
          });
        });

// AJAX
fetch(`https://reqres.in/api/users?page=2`,{
  headers : {
    'x-api-key' : 'reqres-free-v1'
  }
})
.then(res => res.json()) // response를 파싱
.then(result => {
  console.log(result);
})
.catch(err => console.log(err));

// ()가 있을 경우 실행된 함수를 전달, 없을 경우 함수 자체를 전달 
fetch(`https://reqres.in/api/users`, {
  method : 'post',
  headers : {
    'content-type' : 'application/json',
    'x-api-key' : 'reqres-free-v1'
  },
  body : JSON.stringify({
    "name": "morpheus",
    "job": "leader"
  })
})
.then(res => res.json())
.then(result => {
  console.log(result)
})
.catch(err => console.log(err));