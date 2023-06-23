<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org" lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add car</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }

        h2 {
            margin-bottom: 20px;
        }

        nav form {

            margin-right: 10px;
            vertical-align: top;
        }

        label {
            display: inline-block;
            width: 100px;
        }

        input {
            margin-bottom: 10px;
        }

        button {
            display: inline-block;
            margin-top: 10px;
        }
    </style>
</head>
<body>
<h2>Car</h2>

<nav>
    <form action="/car/add" method="post">
        <label>Brand:</label>
        <input type="text" name="brand"><br>
        <label>Model:</label>
        <input type="text" name="model"><br>
        <label>Release year:</label>
        <input type="number" name="year"><br>
        <label>Price:</label>
        <input type="number" name="price"><br>
        <label>Car number:</label>
        <input type="text" name="number"><br>
        <button type="submit">Add car</button>
    </form>

    <form action="/car/list" method="get">
        <button type="submit">Cars list</button>
    </form>

    <form action="/" method="get">
        <button type="submit">Home</button>
    </form>


</nav>

</body>
</html>
