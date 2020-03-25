// add pageTitle
const shoppingList = "My Shopping List";
// add groceries
let groceries = ['butter', 'milk', 'eggs', 'chicken', 'crackers','soup','chocolate', 'turkey', 'ham', 'beer' ];

/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */
function setPageTitle() {
    const pageTitle = document.getElementById('title');
    pageTitle.innerText = shoppingList;
  }

/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
function displayGroceries() {
  const groceryList = document.getElementById('groceries');
  groceries.forEach((item) => {
    const container = document.createElement('li');
    container.innerText = item;
    groceryList.appendChild(container);
});
}

/**
 * This function will be called when the button is clicked. You will need to get a reference
 * to every list item and add the class completed to each one
 */
function markCompleted() {
  const groceryLi = document.querySelectorAll('li');
  groceryLi.forEach((element) => {
    element.setAttribute('class', 'completed');
//add class
});
}

setPageTitle();

displayGroceries();

// Don't worry too much about what is going on here, we will cover this when we discuss events.
document.addEventListener('DOMContentLoaded', () => {
  // When the DOM Content has loaded attach a click listener to the button
  const button = document.querySelector('.btn');
  button.addEventListener('click', markCompleted);
});
