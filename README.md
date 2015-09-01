# University Registrar

##### Epicodus Week Four Advanced Database Assignment, 09/1/2015

##### Summer Brochtrup & Juliana Suzuki

## Description
A website where users can add/remove courses and students, search for students by name, and add/remove students to courses.

## Setup

Clone this repository:
```
$ cd ~/Desktop
$ git clone https://github.com/SummerBr/university-registrar-java.git
$ cd university-registrar
```

Open terminal and run Postgres:
```
$ postgres
```

Open a new tab in terminal by pressing ⌘t and create `registrar` database:
```
$ psql
$ CREATE DATABASE registrar;
$ psql registrar < registrar.sql
```

Navigate back to the directory where this repository has been cloned and run gradle:
```
$ gradle run
```

## Legal

*{This is boilerplate legal language. Read through it, and if you like it, use it. There are other license agreements online, but you can generally copy and paste this.}*

Copyright (c) 2015 Summer Brochtrup & Juliana Suzuki

This software is licensed under the MIT license.

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
