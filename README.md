# Nova Programming Language

Nova is a statically-typed, compiled programming language designed for:

- Performance  
- Systems-level programming  
- Native compilation via C backend  
- CLI tooling  
- Lightweight runtime environments  

Nova compiles to C source code, which is then compiled using a system C compiler (e.g., GCC or Clang).

---

## 1. Design Goals

Nova is built around the following principles:

- Simple, readable syntax  
- Minimal runtime overhead  
- Predictable compilation  
- Clear mutability model  
- Portability across platforms  
- Structured CLI toolchain  

---

## 2. Program Structure

A Nova program consists of:

- A program declaration  
- Function declarations  
- Statements  
- Expressions  

Example:

```nova
program main

fn main() {
    println("Hello, Nova!")
}
