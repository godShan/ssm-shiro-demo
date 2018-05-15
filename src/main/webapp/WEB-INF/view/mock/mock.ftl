<html>
<head>
    <title>mock展示</title>
</head>
<body>
<#function date_to_ymd date>
    <#if date??>
        <#return date?string('yyyy-MM-dd HH:mm:ss')/>
    </#if>
    <#return ""/>
</#function>
<table>
    <tr>
        <th>自增ID</th>
        <th>请求接口路径</th>
        <th>返回参数</th>
        <th>创建时间</th>
        <th>备注</th>
    </tr>
<#list mockList as mock>
    <tr>
        <td>${mock.ID}</td>
        <td>${mock.URL}</td>
        <td>${mock.DATA}</td>
        <td>${date_to_ymd(mock.CREATEDAT)}</td>
        <td>${mock.remark}</td>
    </tr>
</#list>
</table>
</body>
</html>