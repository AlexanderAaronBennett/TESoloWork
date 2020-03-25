
//   {
fetch('assets/data/shopping-list.json')
  .then((response) => {
    return response.json();
  })
  .then((shoppingList) => {
    if('content' in document.createElement('template')) {
      const list = document.querySelector("ul");
      shoppingList.forEach((product) => {
        const listTwo = document.getElementById('shopping-list-item-template').content.cloneNode(true);
        listTwo.querySelector("li").insertAdjacentHTML('afterbegin', product.name);
        if( product.completed ) {
          const circleCheck = listTwo.querySelector('.fa-check-circle');
          circleCheck.className += " completed";
        }
        list.appendChild(listTwo);
      });
    } else {
      console.error('Your browser does not support templates');
    }
  })
  .catch((err) => {console.error(err)});
// }

// document.addEventListener('DOMContentLoaded', () => {
//     const loadButton= document.getElementsByClassName('.loadingButton');
//     displayShoppingList.addEventListener('click', () => {
//         function displayShoppingList ();
//     });
// });