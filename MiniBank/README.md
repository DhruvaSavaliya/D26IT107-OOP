# MiniBank

MiniBank is a Java 17 console banking application. Its source files are organized
into `model`, `util`, and `service` packages under `src/main/java`.

## Build and run

From this folder, run:

```bash
./build.sh
java -jar build/minibank.jar
```

The menu lets you open accounts, deposit, withdraw, transfer, list accounts,
view a statement, run concurrency and transaction-processing demos, generate an
end-of-day report, and exit. New accounts ask for a valid email and mobile number.
Withdrawal rules are demonstrated with both an anonymous class and a lambda.
Runtime annotations (`@Id`, `@Positive`, and `@MaxLength`) are checked by
`util.AnnotationValidator` using reflection. Checked bank exceptions report invalid
amounts, missing accounts, and insufficient funds; transfers roll back on failure.
The console scanner is managed by a try-with-resources `BankSession`. Account deposits, withdrawals, and balance reads are synchronized. Choose menu option 7 to compare unsynchronized and synchronized deposits. Menu option 8 runs a four-thread transaction pool, a wait/notify producer-consumer queue, and opposite-order versus ordered-lock transfers.

Account data is loaded from `data/accounts.dat` at startup and saved when you
exit. Deposits, withdrawals, and transfers are appended to
`data/logs/transactions.log`. Choose menu option 9 to generate and display the
end-of-day report at `data/reports/end-of-day-report.txt`. These runtime data
files are excluded from Git.

## Package layout

- `model`: accounts, customers, transactions, and account interfaces
- `util`: input and annotation validation, command parsing, and statement formatting
- `model.annotation`: runtime field annotations used for identifiers and validation
- `exception`: checked bank exception hierarchy for transaction failures
- `service`: the menu, transaction worker pool, and producer-consumer buffer
