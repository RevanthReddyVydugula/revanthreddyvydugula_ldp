document.addEventListener("DOMContentLoaded", function () {
    // Initialize scores from storage or default to 0
    let localScore = parseInt(localStorage.getItem("localScore")) || 0;
    let sessionScore = parseInt(sessionStorage.getItem("sessionScore")) || 0;

    // To display initial scores
    //updateScores();

    // Increment scores on button click
    document.getElementById("incrementButton").addEventListener("click", function () {
        localScore++;
        sessionScore++;
        updateScores();
    });

    // Update scores in the UI and store in localStorage/sessionStorage
    function updateScores() {
        document.getElementById("localScore").textContent = localScore;
        document.getElementById("sessionScore").textContent = sessionScore;
        localStorage.setItem("localScore", localScore);
        sessionStorage.setItem("sessionScore", sessionScore);
    }
});