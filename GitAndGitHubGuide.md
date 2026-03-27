# 📘 Git & GitHub Guide (Java Practice Repository)

This guide explains how to use Git and GitHub to manage and track progress in this Java learning repository.

---

## 🔧 Initial Setup (One-Time)

### 1. Configure Git

```bash
git config --global user.name "Your Name"
git config --global user.email "your-email@example.com"
```

---

### 2. Initialize Repository

```bash
git init
```

---

### 3. Add Remote Repository

```bash
git remote add origin https://github.com/your-username/JAVA.git
```

---

### 4. First Push

```bash
git add .
git commit -m "Day 01: Initial Java setup"
git branch -M main
git push -u origin main
```

---

## 🔁 Daily Workflow

Whenever you practice Java:

```bash
git add .
git commit -m "Day XX: Description of work"
git push
```

### ✅ Example

```bash
git commit -m "Day 05: Practiced ArrayList and LinkedList"
```

---

## ⚠️ Important Rules

### 1. Avoid unnecessary files

Create `.gitignore` file:

```
*.class
```

👉 Prevents compiled files from uploading

---

### 2. Write meaningful commit messages

❌ Bad:

```
update
code
```

✅ Good:

```
Day 10: Implemented inheritance examples
Day 12: Practiced file handling using BufferedReader
```

---

### 3. Pull before push (if needed)

If error occurs:

```bash
git pull origin main --rebase
git push
```

---

## 🛠 Common Commands

| Command             | Purpose                 |
| ------------------- | ----------------------- |
| git status          | Check changes           |
| git add .           | Add all files           |
| git commit -m "msg" | Save changes            |
| git push            | Upload to GitHub        |
| git pull            | Download latest changes |

---

## 🎯 Goal

* Track daily progress
* Build consistency
* Showcase learning publicly

---

## 📌 Notes

* Commit regularly (daily preferred)
* Keep code organized (topic-wise folders)
* Improve code quality over time

---

⭐ This repository represents a structured and consistent Java learning journey.
