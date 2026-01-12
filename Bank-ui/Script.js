let balance = 0;
function deposit() {
    let amount = Number(document.getElementById("amount").value);

    if (amount <= 0) {
        document.getElementById("message").innerText = "Invalid deposit amount";
        return;
    }
    balance = balance + amount;
    document.getElementById("message").innerText = "Deposit successful";
    updateBalance();
   }
function withdraw() {
    let amount = Number(document.getElementById("amount").value);

    if (amount <= 0 || amount > balance) {
        document.getElementById("message").innerText =
            "Invalid or insufficient balance";
        return;
    }
    balance = balance - amount;
    document.getElementById("message").innerText = "Withdrawal successful";
    updateBalance();
}
function updateBalance() {
    document.getElementById("balance").innerText = balance;
    document.getElementById("amount").value = "";
}
