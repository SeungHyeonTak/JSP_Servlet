<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>insert title here</title>
</head>
<body>
<form action="mSignUp" method="post">
    name : <input type="text" name="m_name"> <br>
    password : <input type="password" name="m_pass"> <br>
    gender : Man<input type="radio" name="m_gender" value="M" checked="checked">,
            Woman<input type="radio" name="m_gender" value="W"> <br>
    hobby : Sport<input type="checkbox" name="m_hobby" value="sport">
            Cooking<input type="checkbox" name="m_hobby" value="cooking">
            Reading<input type="checkbox" name="m_hobby" value="reading">
            Travel<input type="checkbox" name="m_hobby" value="travel"> <br>
    residence : <select name="m_residence">
                    <option value="seoul" selected="selected">Seoul</option>
                    <option value="gyeonggi" selected="selected">Gyeonggi</option>
                    <option value="chungcheong" selected="selected">Chungcheong</option>
                    <option value="jeonra" selected="selected">Jeonra</option>
                    <option value="jeju" selected="selected">Jeju</option>
                    <option value="gyeongsang" selected="selected">Gyeongsang</option>
                    <option value="gangwon" selected="selected">Gangwon</option>
                </select> <br>
                <input type="submit" value="sign up">
</form>
</body>
</html>
