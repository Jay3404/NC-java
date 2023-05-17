let slideIndex = 1;

//HTML 파일에 있는 모든 태그들이 로드 된 후에 동작
$(function() {
    //해당 인덱스의 슬라이드 표출 메소드 호출
    showSlides(slideIndex);

    //3초마다 다음 슬라이드 표출
    setInterval(function() {
        showSlides(++slideIndex);
    }, 3000);
});

function plusSlides(n) {
    showSlides(slideIndex += n);
}

function showSlides(n) {
    let i;
    //mySlides 클래스를 가지고 있는 태그들을 javascript 변수로 선언
    const slides = document.getElementsByClassName("mySlides");
    
    //현재 슬라이드 개수보다 n이 커지면 슬라이드 인덱스를 첫 번째로 변경
    if(n > slides.length) {
        slideIndex = 1;
    }
    
    //n이 1보다 작아지면 마지막 슬라이드로 변경
    if(n < 1) {
        slideIndex = slides.length;
    }
    
    //모든 슬라이드 숨김
    for(i = 0; i < slides.length; i++) {
        slides[i].style.display = 'none';
    }

    //현재 선택된 슬라이드만 표출
    slides[slideIndex - 1].style.display = 'block';
}

