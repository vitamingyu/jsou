function chkData(e){
		console.log("submit 버튼")
		e.preventDefault(); // submit 버튼에 적용된 자바스크립트의 기본기능을 해제
		
		// 입력 자료 검사
		if(frm.name.value === ""||isNaN(frm.name.value) === false){
			frm.name.focus();
			alert("이름을 입력하시오(순수 숫자는 안됨");
			return;
		}
		if(frm.id.value.length < 4){
			alert("id는 4글자 이상");
		}
		
		// 정규표현식
		let regExp= /^[a-zA-Z0-9]+/
		if(!frm.email.value.match(regExp)){
			alert("이메일을 정확히 입력하시오");
			return;
			//console.log("성공");
		//}else{
		//	console.log("실패");
		//}
	}
	
	
	let regExp2 = /^[0-9]{1,2}$/;
	if(!frm.age.value.match(regExp2)){
		alert("나이를 정확히 입력하시오");
		return;
		}
		frm.method="get";
		frm.submit();
		}
	function clsData(e){ // 파라미터 이름 e는 내맘
		e.preventDefault(); // 고유기능 해제
		console.log("reset 버튼 : ",e)
		// 원하는 프로그램을 기술 
	}/**
 * 
 */