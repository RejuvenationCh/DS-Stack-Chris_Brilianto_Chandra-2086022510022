<h1>Data Structure - Stack Implementation Project</h1>
Repository ini berisikan jawaban serta implementasi dari Stack-Based problem yang diberikan untuk penugasan Week 5 - Data Structure

<h2>Question 1 — Bracket Checker </h2>
<h4>"Implement is_balanced(s) to check whether brackets are balanced using a stack"</h4>
  
<a> Ini digunakan untuk mengecek apakah ada keseimbangan untuk setiap tanda kurung </a>
<ul>
  <li>Format Input: String berisi tanda kurung tanpa spasi.</li>
  <li>Contoh: {[()]}</li>
  <li>Output: The string is balanced. atau The string is not balanced.</li>
</ul>

<h2> Question 2 — Reverse Polish Notation Evaluation </h2>
<h4>"Implement evaluate_rpn(tokens) using a stack to evaluate postfix expressions"</h4>
<a> Menghitung ekspresi matematika dalam notasi postfix dimana tipe bacanya terbalik (dari kanan ke kiri) </a>
<ul>
  <li> Format Input: Angka dan operator yang dipisahkan oleh spasi (support Spasi yang lebih dari 1) </li>
  <li> Contoh: 2 1 + 3 * </li>
  <li> Output: Final Result : 9 </li>
</ul>

<h2> Question 3 — Chrono Stack Engine (Stack Instruction Reconstruction) </h2>
<h4>"Create a program that outputs the required instruction sequence based on the described temporal stack rules"</h4>
<a> Merekonstruksi instruksi temporal (1, d, +) untuk mencapai target timeline tertentu. </a>
<ul>
  <li> Format Input: [Jumlah_Elemen] [Target1] [Target2] ... </li>
  <li> Contoh: 5 1 5 6 3 2 </li>
  <li> 1d+1+d+d+1d+1+d+d+1d+d+d+1+1d+d+1d+ </li>
</ul>

<h2> Question 4 — Cheat Buster Security System (Stack-Based Ordering) </h2>
<h4>"Implement the process to generate the final ordered output using the described stack injection mechanism"</h4>
<a> Mengurutkan kode rahasia secara ascending menggunakan metode dua stack </a>
<ul>
  <li> Format Input: Deretan angka acak dipisahkan spasi (bisa spasinya lebih dari satu) </li>
  <li> Contoh: 42 9 17 63 28 5 74 </li>
  <li> 5 9 17 28 42 63 74 </li>
</ul>

<h2> Question 5 — Operation Chastise (Stack-Based Counting) </h2>
<h4>"Calculate when the bombs are to be dropped, to which you need to create a formula for it. Assuming the craft's n velocity directly translates to momentum upon drop, calculate the momentum from each of the bounce"</h4>
<a> Menghitung momentum pantulan bom dari kecepatan awal hingga mencapai unit terkecil </a>
<ul>
  <li> Format Input: Satu bilangan bulat (Velocity). </li>
  <li> Contoh: 50 </li>
  <li> 1 3 6 12 25 50 </li>
</ul>


<h3>Asumsi & Penanganan Kasus Tepi (Edge Cases)</h3>
<table border="1">
  <thead>
    <tr>
      <th align="left">Kasus</th>
      <th align="left">Penanganan</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><strong>Input Kosong</strong></td>
      <td>Program memberikan pesan <code>"Input is empty"</code> dan berhenti secara aman.</td>
    </tr>
    <tr>
      <td><strong>Paritas Ganjil (Q1)</strong></td>
      <td>Jika panjang string ganjil, program langsung menyatakan tidak valid menggunakan pengecekan modulo.</td>
    </tr>
    <tr>
      <td><strong>Pembagian Nol (Q2)</strong></td>
      <td>Terdapat logika proteksi menggunakan <code>if (b == 0)</code> untuk mencegah crash.</td>
    </tr>
    <tr>
      <td><strong>Distorsi Waktu (Q3)</strong></td>
      <td>Algoritma menggunakan variabel <code>totalSuffixPlus</code> untuk mengompensasi pengurangan nilai.</td>
    </tr>
    <tr>
      <td><strong>Data Tidak Terurut (Q4)</strong></td>
      <td>Menggunakan stack pembantu (Sorted Stack) untuk memastikan elemen terkecil selalu berada di bawah.</td>
    </tr>
    <tr>
      <td><strong>Pembagian Integer (Q5)</strong></td>
      <td>Menggunakan mekanisme <em>floor division</em> otomatis dari tipe data <code>int</code> Java.</td>
    </tr>
  </tbody>
</table>
