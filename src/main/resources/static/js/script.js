window.onload = function() {
  document.getElementById('menu-icon').addEventListener('click', function () {
    var navLinks = document.getElementById('nav-links');
    if (navLinks.style.display === 'none') {
      navLinks.style.display = 'block';
    } else {
      navLinks.style.display = 'none';
    }
  });
};

document.getElementById('about-us-link').addEventListener('click', function(event) {
  event.preventDefault(); // Зупиняємо стандартну поведінку посилання
  const aboutUsSection = document.getElementById('about-us');
  aboutUsSection.scrollIntoView({behavior: "smooth"});
});

document.getElementById('services-link').addEventListener('click', function(event) {
  event.preventDefault();
  const servicesSection = document.getElementById('services');
  servicesSection.scrollIntoView({behavior: "smooth"});
});

var modals = document.querySelectorAll('.modal');
var btns = document.querySelectorAll('.service-item');

btns.forEach((btn, index) => {
  btn.onclick = function() {
    modals[index].style.display = "block";
  }
});

modals.forEach((modal) => {
  // Отримуємо елемент 'закрити' для цього модального вікна
  var span = modal.getElementsByClassName('close')[0];

  span.onclick = function() {
    modal.style.display = "none";
  }
});


