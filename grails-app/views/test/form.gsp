<%@ page import="grails.chain.select.*" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<title>Chained Select Test</title>
		  <g:javascript library='jquery' />
             <r:layoutResources/>
	</head>
	<body>
        <div>
            <b>Category: </b>
            <g:select id="category" name="category.id" from="${Category.listOrderByName()}" optionKey="id"
                      noSelection="[null:' ']"
                      onchange="categoryChanged(this.value);" />
        </div>
        <div>
            <b>Sub-Category: </b>
            <span id="subContainer"></span>
        </div>
        <script>
            function categoryChanged(categoryId) {
                <g:remoteFunction controller="test" action="categoryChanged"
                    update="subContainer"
                    params="'categoryId='+categoryId"/>
            }
        </script>
	</body>
</html>