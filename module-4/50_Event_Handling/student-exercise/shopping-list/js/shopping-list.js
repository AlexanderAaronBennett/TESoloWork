let allItemsIncomplete = true;
const pageTitle = 'My Shopping List';
const groceries = [
  { id: 1, name: 'Oatmeal', completed: false },
  { id: 2, name: 'Milk', completed: false },
  { id: 3, name: 'Banana', completed: false },
  { id: 4, name: 'Strawberries', completed: false },
  { id: 5, name: 'Lunch Meat', completed: false },
  { id: 6, name: 'Bread', completed: false },
  { id: 7, name: 'Grapes', completed: false },
  { id: 8, name: 'Steak', completed: false },
  { id: 9, name: 'Salad', completed: false },
  { id: 10, name: 'Tea', completed: false }
];

document.addEventListener('DOMContentLoaded', () => {
  setPageTitle();
  displayGroceries();

  const groceries = document.querySelectorAll('li');

  groceries.forEach((grocery) => {
    grocery.addEventListener('click', () => {
    
      if (grocery.classList.contains('completed'));
      grocery.classList.add('completed');
      grocery.querySelector('i').classList.add('completed')
    });
    grocery.addEventListener('dblclick', () => {
      if (grocery.classList.contains('completed')) {
        grocery.classList.remove('completed');
        grocery.querySelector('i').classList.remove('completed');
      }
    })
  });




  const toggleAll = document.getElementById('toggleAll');

  toggleAll.addEventListener('click', () => {
    // let isPartiallyComplete = false;
    let numberOfItems = 0;

    groceries.forEach((grocery) => {
      if (grocery.classList.contains('completed')) {
        // isPartiallyComplete = true;
        numberOfItems ++;
      }
    });

    groceries.forEach((grocery) => {

      if (numberOfItems == groceries.length) {
        grocery.classList.remove('completed');
        grocery.querySelector('i').classList.remove('completed');
        toggleAll.innerText = 'Mark  All Complete';
      }
      else if (!grocery.classList.contains('completed')) {
        grocery.classList.add('completed');
        grocery.querySelector('i').classList.add('completed');
        toggleAll.innerText = 'Mark All Incomplete';
      }
      
      // else if (!isPartiallyComplete) {
      //   grocery.classList.add('completed');
      //   grocery.querySelector('i').classList.add('completed');
      //   toggleAll.innerText = 'Mark All Incomplete';
      // }
    })
  });
});


/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */
function setPageTitle() {
  const title = document.getElementById('title');
  title.innerText = pageTitle;
}

/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
function displayGroceries() {
  const ul = document.querySelector('ul');
  groceries.forEach((item) => {
    const li = document.createElement('li');
    li.innerText = item.name;
    const checkCircle = document.createElement('i');
    checkCircle.setAttribute('class', 'far fa-check-circle');
    li.appendChild(checkCircle);
    ul.appendChild(li);
  });
}