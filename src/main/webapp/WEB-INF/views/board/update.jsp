<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script defer src="/js/filemanager.js"></script>
<c:import url="../temp/boot.jsp"></c:import>
<c:import url="../temp/summer.jsp"></c:import>
<body>

    <div class="container-fluid">
	<div class="row justify-content-center">
		<div class="col-6">
		<h1>Board Write Page</h1>
		<form action="update" method="post" enctype="multipart/form-data">
			<div class="mb-3">
			  <label for="title" class="form-label">Titlea</label>
			  	<input type="text" name="title" class="form-control" id="title" value="${qna.title}">
			</div>
			<div class="mb-3">
                <label for="writer" class="form-label">Writer</label>
                <input type="text" name="writer" class="form-control" id="writer" value="${qna.writer}">
			</div>
			<div class="mb-3">
			  <label for="contents" class="form-label">Contents</label>
			  <textarea class="form-control" name="contents" id="contents" value="${qna.contents}"></textarea>
			</div>
			
            <div>

                <button type="button" class="fileDelete">파일 삭제</button>
            </div>

			<div id="addFiles">
				<button type="button" class="btn btn-danger" id="fileAdd">파일 추가</button>
			</div>
			
			<div>
				<button class="btn btn-danger">WRITE</button>
			</div>
		</form>
		</div>

        <script type="text/javascript">
            $('#contents').summernote({
                tabsize: 4,
                height: 250
              });
            </script>
</body>
</html>