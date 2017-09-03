<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
<body>
<div style="width:100%" align="center" >
    <div style="margin-bottom: 60px;margin-top: 100px">
        <label style="font-size: 30px;font-family: Arial;font-weight: bold;color: #FF9A00">N</label>
        <label style="font-size: 30px;font-family: Arial;font-weight: bold;color: #363636">OTICE</label>
    </div>

    <form method="get">
        <div style="width:800px;display: flex;" align="left">

            <div style="width:400px" >
                <select>
                    <option>10</option>
                    <option>20</option>
                    <option>30</option>
                </select>
            </div>
            <div style="width:400px" align="right">

                <input class="indexInput" type="text" name="searchWord">
                <button type="submit">검색</button>
            </div>


        </div>
    </form>
    <table class="noticeTable" width="800px" style="margin-top: 10px">
        <tr>
            <th width="5%"><input type="checkbox" style="width: auto"></th>
            <th width="5%">번호</th>
            <th width="50%">제목</th>
            <th>이름</th>
            <th>날짜</th>
            <th>조회</th>
            <th>Like</th>
        </tr>
        <tr>
            <td><input type="checkbox"></td>
            <td>3</td>
            <td>이것은 제목입니다 3</td>
            <td>현지</td>
            <td>170830</td>
            <td>5</td>
            <td>10</td>
        </tr>
        <tr>
            <td><input type="checkbox"></td>
            <td>3</td>
            <td>이것은 제목입니다 2</td>
            <td>현지</td>
            <td>170830</td>
            <td>5</td>
            <td>10</td>
        </tr>
        <td><input type="checkbox"></td>
        <td>3</td>
        <td>이것은 제목입니다 1</td>
        <td>현지</td>
        <td>170830</td>
        <td>5</td>
        <td>10</td>
    </table>
    <div style="width: 800px;margin-top: 10px" align="center">
        <button><<</button><button><</button>&nbsp;&nbsp;
        <a href="#">1</a>&nbsp;&nbsp; <a href="#">2</a>&nbsp;&nbsp;
        <button>></button><button>>></button>
    </div>
    <div style="width: 800px;margin-top: 10px" align="right">
        <button>등록</button>&nbsp;&nbsp;<button>삭제</button>
    </div>

</div>
</body>
</html>