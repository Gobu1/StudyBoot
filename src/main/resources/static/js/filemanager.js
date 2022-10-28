let count=0;
let idx=0;
$("#fileAdd").click(function(){
    console.log(count);
    if(count>4){
        alert("최대 5개만 가능")
        return;
    }
    $("#addFiles").append('<div class="mb-3" id="file'+idx+'"></div>');
    $("#file"+idx).append('<label class="form-label" for="files">File</label>')
    $("#file"+idx).append('<input type="file" class="form-controle" name="files" id="files">');
    $("#file"+idx).append('<button type="button" class="del btn btn-danger" title='+idx+'>삭제</button>');
    count++;
    idx++;
    
})

$("#addFiles").on('click', '.del', function(){
    console.log($(this));
    let ts = $(this).parent()
    ts.remove();
    count--;
})

$(".deleteFile").click(function(){

})