Nova is a statically-typed, compiled programming language designed for:
Performance
Systems-level programming
Native compilation via C backend
CLI tooling
Lightweight runtime environments
Nova compiles to C source code, which is then compiled using a system C compiler (e.g., GCC or Clang).
2. Design Goals
Nova is built around the following principles:
Simple, readable syntax
Minimal runtime overhead
Predictable compilation
Clear mutability model
Portability across platforms
Structured CLI toolchain
3. Program Structure
A Nova program consists of:
A program declaration
Function declarations
Statements
Expressions
Example:
program main

fn main() {
    println("Hello, Nova!")
}
4. Lexical Structure
4.1 Keywords
Kopiera kod

program
fn
let
mut
if
else
for
while
return
struct
enum
true
false
Keywords are reserved and cannot be used as identifiers.
4.2 Identifiers
Identifiers must:
Begin with a letter or underscore
Contain letters, numbers, or underscores
Be case-sensitive
Valid:
Kopiera kod

myVar
_count
NovaValue1
Invalid:
Kopiera kod

1value
let
4.3 Comments
Single-line:

// This is a comment
Multi-line:
Nova
Kopiera kod
/*
   Multi-line
   comment
*/
5. Variables
Nova uses explicit mutability.
Immutable variable

let x = 10
Mutable variable
Nova
Kopiera kod
let mut counter = 0
counter = counter + 1
6. Data Types
6.1 Primitive Types


int
float
bool
string
char
Example:
Nova
Kopiera kod
let age: int = 18
let pi: float = 3.14
let active: bool = true
let name: string = "Nova"
Type inference is supported:

let x = 5
7. Functions
Function Declaration

fn add(a: int, b: int) -> int {
    return a + b
}
Void Function

fn greet() {
    println("Hello")
}
8. Control Flow
8.1 If Statement

if x > 10 {
    println("Large")
} else {
    println("Small")
}
8.2 While Loop

while x < 10 {
    x = x + 1
}
8.3 For Loop

for i in 0..10 {
    println(i)
}
9. Structs

struct User {
    name: string
    age: int
}
Usage:

let user = User {
    name: "Luqmaan",
    age: 18
}
10. Enums
enum Result {
    Ok
    Error
}
11. Standard Library (Core)
Minimum required:


println()
print()
read_line()
len()
to_string()
Example:
Nova
Kopiera kod
println("Nova Language")
12. Memory Model
Nova uses:
Stack allocation for primitives
Heap allocation for dynamic objects
No garbage collector (manual or compiler-managed depending on implementation)
(Must be clearly defined in implementation.)
13. Compilation Model
Nova compilation pipeline:
Kopiera kod

Nova Source (.nova)
        ↓
Parser → AST
        ↓
C Code Generation
        ↓
C Compiler (gcc/clang)
        ↓
Native Binary
Example:
Bash
Kopiera kod
nova build main.nova
14. CLI Commands (Planned)
Kopiera kod

nova init
nova build
nova run
nova clean
nova version
15. Future Roadmap
Package manager
Module system
Error handling system
Pattern matching
Async support
IDE integration
Nova SDK
16. Grammar (EBNF Draft)


program     ::= "program" IDENT declaration*
declaration ::= fn_decl | struct_decl | enum_decl | let_stmt

fn_decl     ::= "fn" IDENT "(" params? ")" return_type? block
params      ::= param ("," param)*
param       ::= IDENT ":" TYPE
return_type ::= "->" TYPE

block       ::= "{" statement* "}"

statement   ::= let_stmt
              | expr
              | if_stmt
              | while_stmt
              | return_stmt

let_stmt    ::= "let" "mut"? IDENT (":" TYPE)? "=" expr

if_stmt     ::= "if" expr block ("else" block)?

expr        ::= literal
              | IDENT
              | expr operator expr
              | call_expr
