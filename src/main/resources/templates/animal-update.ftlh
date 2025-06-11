<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>create form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
  </head>
  <body>
    
<form id="new-elephant" action="/elephants/update/${elephant.animalId?c}" method="post" enctype="multipart/form-data">
      <input type="text" id="animalId" name="animalId" value="${elephant.animalId?c}" readonly />
      <input type="text" id="name" name="name" value="${elephant.name}" placeholder="Name" />
      <input type="text" id="habitat" name="habitat" value="${elephant.habitat}" placeholder="Habitat" />
      
      <input type="text" id="description" name="description" value="${elephant.description}" placeholder="Description" />
      <input type="text" id="species" name="species"  value="${elephant.species}" placeholder="Species" /><br>
      <input type="file" id="picture" name="picture" />
      <button type="submit" class="btn btn-primary">Save</button>
      <a href="/elephants/${elephant.elephantId?c}" class="btn btn-outline-danger">Cancel</a>
    </form>
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO" crossorigin="anonymous"></script>
  </body>
</html>