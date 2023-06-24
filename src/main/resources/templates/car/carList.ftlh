<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Car List</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
        }

        table {
            border-collapse: collapse;
            width: 100%;
        }

        th, td {
            border: 1px solid #ddd;
            padding: 8px;
        }

        th {
            background-color: #f2f2f2;
        }

        tr:nth-child(even) {
            background-color: #f9f9f9;
        }

        tr:hover {
            background-color: #f5f5f5;
        }

        button {
            display: inline-block;
            margin-top: 10px;
        }
    </style>
</head>
<body>
    <table>
        <thead>
        <tr>
            <th>ID</th>
            <th>Brand</th>
            <th>Model</th>
            <th>Year</th>
            <th>Price</th>
            <th>Number</th>
        </tr>
        </thead>
        <tbody>
        <#list allCars as car>
            <tr>
                <td>${car.id}</td>
                <td>${car.brand}</td>
                <td>${car.model}</td>
                <td>${car.year?c}</td>
                <td>${car.price?string('0.##')}</td>
                <td>${car.number}</td>
            </tr>
        </#list>
        </tbody>
    </table>

    <form action="/car/add" method="get">
        <button type="submit">Back</button>
    </form>

    <form action="/" method="get">
        <button type="submit">Home</button>
    </form>

</body>
</html>
