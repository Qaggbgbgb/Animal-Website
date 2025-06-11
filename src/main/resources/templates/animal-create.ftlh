<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>create form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
  </head>
  <body>
    <form id="new-elephant" action="/elephants" method="post" enctype="multipart/form-data">
        <input type="text" id="name" name="name" placeholder="Name"/>
        <input type="text" id="habitat" name="habitat" placeholder="Habitat"/>
        
        <input type="text" id="description" name="description" placeholder="Description"/>
        <input type="text" id="species" name="species"  placeholder="Species"/>
        <input type="file" id="picture" name="picture" required/>
        <button type="submit" class="btn btn-primary">Save</button>
       <a href="/elephants" class="btn btn-outline-danger" >Cancel</a>
    </form>


    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO" crossorigin="anonymous"></script>
  </body>
</html>