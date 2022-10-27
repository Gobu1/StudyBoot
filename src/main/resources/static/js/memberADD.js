console.log("memberadd");


$("#all").click(function(){
    let ch = $(this).prop("checked");

    $(".check").prop("checked", ch);
});

$(".check").click(function(){
    
    let flag = true;
    $(".check").each(function(index, ck){
        let ch = $(ck).prop("checked")
        
        if(!ch){
           flag=false;
        }
    })
    $("#all").prop("checked", flag)
    
})

// $("#btn1").click(function(){
//     let s=$(".joinF").length;

//     if($("#id").val().length < 5){
//         s--;
//         console.log("5글자 이상 적어주세요");
//     }
    
//     if($("#pw").val().length < 4){
//         s--;
//         console.log("8글자 이상 적어주세요");
//     }

//     if($("#name").val().length == 0){
//         s--;
//         console.log("이름을 적어주세요")
//     }
//     if($("#email").val().length == 0){
//         s--;
//         console.log("이메일 적어주세요");
//     }
//     console.log(s);
//     if(s == $(".joinF").length){
//         // $("#joinform").submit();
//     }else{
//         alert("다시 확인해주세요")
//     }
// })
$("#id").blur(function(){
    let id = $("#id").val();
    console.log(id+"확인");
    if(id != null){
        $.get("./idCheck?id="+id, function(data){
            console.log(data);
        })
    }
})

