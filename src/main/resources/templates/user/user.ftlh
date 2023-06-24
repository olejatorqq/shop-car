<!DOCTYPE html>
<html lang="en">
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

        <label>Name:</label>
        <input type="text" name="name"><br>

        <label>Surname:</label>
        <input type="text" name="surname"><br>

        <label>Phone:</label>
        <input type="text" name="phone"><br>

        <label>Email:</label>
        <input type="text" name="email"><br>

        <label>Budget:</label>
        <input type="number" name="budget"><br>

        <label>Car:</label>
        <select name="car">
            <#list allCars as car>
                <option>${car.brand} ${car.model}</option>
            </#list>
        </select>

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