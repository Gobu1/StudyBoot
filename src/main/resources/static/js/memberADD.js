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

$("#test2").click(function(){
    let id = "abcd";
    $.ajax({
        type:"GET",
        url:"idCheck",
        data:{
            id:id
        },
        success:function(data){
            console.log(data+" : DATA")
        },
        error:function(xhr,status,error){
            console.log("--------")
            console.log(xhr)
            console.log(status)
            console.log(error)
        }
    })

})

$("#test3").click(function(){
    let id = "ABCD";
    let name = "IU";
    let ar = [1,2,3];
    $.ajax({
        type:"POST",
        url:"test",
        traditional:true,
        data:{
            id:id,
            name:name,
            ar:ar
        },
        success:function(result){
            console.log("result - "+result)
        }
    })

})
let count = 3
$("#sbtn1").click(function(){
    
    let add = '<option>'+count+'</option>';
    $("#s1").append(add);
    count++;
})