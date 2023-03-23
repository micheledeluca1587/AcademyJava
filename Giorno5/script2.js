fetch('https://api.rawg.io/api/games?key=9af72c943356453fb08b37b3f1f9a18a')
    .then(resp => resp.json())
    .then(data => {
        console.log('dati arrivati')
        renderGames(data.results);
        renderCategories(data.results)
    });

function renderGames(games){
    let gamescontainer = document.querySelector('#gamescontainer');
   
    games.forEach(game => {
        let col = document.createElement('div');
        col.classList.add('col-12', 'col-md-4', 'my-2');
        col.innerHTML = `
            
        <div class="card" style="width: 18rem;">
                <img src="${game.background_image}" class="card-img-top" alt="${game.name}">
                <div class="card-body">
                    <h5 class="card-title">${game.name}</h5>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                    <a href="#" class="btn btn-primary">Go somewhere</a>
                </div>
            </div>
        `;
        gamescontainer.appendChild(col);
    });

}


function renderCategories(games){
    
    let categories = Array.from(
            new Set(games.map(game => game.genres)
                .map(el => el.map(x => x.name))
                .flat())
        )
    let categorycontainer = document.querySelector('#categorycontainer');
    categories.forEach(category => {
        let li = document.createElement('li');
        li.classList.add("dropdown-item");
        li.innerHTML = category;
        categorycontainer.appendChild(li)
    })
}




