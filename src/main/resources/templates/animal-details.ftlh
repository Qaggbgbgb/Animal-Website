<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>5 FAST FACTS ABOUT ${elephant.name}</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
</head>
<body>

<ul class="list-group">
  <li class="list-group-item">1.There are 17 muscles in an elephant's trunk.</li>
  <li class="list-group-item">2.Elephant pregnancies take up to 22 months, and their babies can weigh as much as 350 pounds (159 kg).</li>
  <li class="list-group-item">3.Elephants are right- or left-tusked, just as humans are right- or left-handed.</li>
  <li class="list-group-item">4.Elephants eat more than 300 pounds (136 kg) of food a day.</li>
  <li class="list-group-item">5.Elephants can use their trunk like a snorkel in the water.</li>
</ul>    

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO" crossorigin="anonymous"></script>
    <div class="dropdown">
  <button class="btn btn-secondary dropdown-toggle" type="button" data-bs-toggle="dropdown" aria-expanded="false">
    Menu
  </button>
  <ul class="dropdown-menu">
  <li><span class="dropdown-item-text">Menu content</span></li>
  <li><a class="dropdown-item" href="index.html">home</a></li>
  <li><a class="dropdown-item" href="about.html">about</a></li>
</ul>
</div>

<div class="container" style="margin-top: 15px;">
    <h1>${title}</h1>
    <div class="card">
      <h5 class="card-header">${elephants.name}</h5>
      <img src="/profile-pictures/${(elephant.profilePicturePath)!'avatar.png'}" class="card-img-top"
        style="height: 100px; width: 100px;" alt="profile picture">
      <div class="card-body">
        <span style="float:right"> <a href="/elephants/updateForm/${elephant.animalId?c}" class="btn btn-primary">Edit
            Elephant</a></span>
        <h5 class="card-title">ID: ${elephant.animalId?c}</h5>
        <p class="card-text">Description: ${elephant.description}</p>
        <p class="card-text">Name: ${elephant.name}</p>
        <p class="card-text">Habitat: ${elephant.habitat}</p>
        <p class="card-text">Species: ${elephant.species}</p>
        <a href="/Elephants/delete/${elephant.animalId?c}" class="btn btn-danger">Delete
          Elephant</a>

        <a href="/elephants" class="btn btn-primary">Go back</a>
      </div>
    </div>

  </div>
</body>

</html>