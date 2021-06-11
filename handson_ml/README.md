<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" lang="" xml:lang="">
<head>
  <meta charset="utf-8" />
  <meta name="generator" content="pandoc" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=yes" />
  <title>Notes</title>
  <style>
    html {
      line-height: 1.7;
      font-family: Georgia, serif;
      font-size: 20px;
      color: #1a1a1a;
      background-color: #fdfdfd;
    }
    body {
      margin: 0 auto;
      max-width: 40em;
      padding-left: 50px;
      padding-right: 50px;
      padding-top: 50px;
      padding-bottom: 50px;
      hyphens: auto;
      word-wrap: break-word;
      text-rendering: optimizeLegibility;
      font-kerning: normal;
    }
    @media (max-width: 600px) {
      body {
        font-size: 0.9em;
        padding: 1em;
      }
    }
    @media print {
      body {
        background-color: transparent;
        color: black;
      }
      p, h2, h3 {
        orphans: 3;
        widows: 3;
      }
      h2, h3, h4 {
        page-break-after: avoid;
      }
    }
    p {
      margin-top: 1.7em;
    }
    a {
      color: #1a1a1a;
    }
    a:visited {
      color: #1a1a1a;
    }
    img {
      max-width: 100%;
    }
    h1, h2, h3, h4, h5, h6 {
      margin-top: 1.7em;
    }
    ol, ul {
      padding-left: 1.7em;
      margin-top: 1.7em;
    }
    li > ol, li > ul {
      margin-top: 0;
    }
    blockquote {
      margin: 1.7em 0 1.7em 1.7em;
      padding-left: 1em;
      border-left: 2px solid #e6e6e6;
      font-style: italic;
    }
    code {
      font-family: Menlo, Monaco, 'Lucida Console', Consolas, monospace;
      background-color: #f0f0f0;
      font-size: 85%;
      margin: 0;
      padding: .2em .4em;
    }
    pre {
      line-height: 1.5em;
      padding: 1em;
      background-color: #f0f0f0;
      overflow: auto;
    }
    pre code {
      padding: 0;
      overflow: visible;
    }
    hr {
      background-color: #1a1a1a;
      border: none;
      height: 1px;
      margin-top: 1.7em;
    }
    table {
      border-collapse: collapse;
      width: 100%;
      overflow-x: auto;
      display: block;
    }
    th, td {
      border-bottom: 1px solid lightgray;
      padding: 1em 3em 1em 0;
    }
    header {
      margin-bottom: 6em;
      text-align: center;
    }
    nav a:not(:hover) {
      text-decoration: none;
    }
    code{white-space: pre-wrap;}
    span.smallcaps{font-variant: small-caps;}
    span.underline{text-decoration: underline;}
    div.column{display: inline-block; vertical-align: top; width: 50%;}
    div.hanging-indent{margin-left: 1.5em; text-indent: -1.5em;}
    ul.task-list{list-style: none;}
    .display.math{display: block; text-align: center; margin: 0.5rem auto;}
  </style>
  <!--[if lt IE 9]>
    <script src="//cdnjs.cloudflare.com/ajax/libs/html5shiv/3.7.3/html5shiv-printshiv.min.js"></script>
  <![endif]-->
</head>
<body>
<nav id="TOC" role="doc-toc">
<ul>
<li><a href="#the-machine-learning-landscape"><span class="toc-section-number">1</span> The Machine Learning Landscape</a>
<ul>
<li><a href="#types-of-machine-learning-systems"><span class="toc-section-number">1.1</span> Types of Machine Learning Systems</a>
<ul>
<li><a href="#supervised-vs-unsupervised"><span class="toc-section-number">1.1.1</span> Supervised vs Unsupervised</a></li>
<li><a href="#batch-and-online-learning"><span class="toc-section-number">1.1.2</span> Batch and Online Learning</a></li>
<li><a href="#instance-based-vs.-model-based-learning"><span class="toc-section-number">1.1.3</span> Instance-Based vs. Model-Based learning</a></li>
</ul></li>
<li><a href="#main-challenges-of-machine-learning"><span class="toc-section-number">1.2</span> Main Challenges of Machine Learning</a></li>
<li><a href="#testing-and-validation"><span class="toc-section-number">1.3</span> Testing and Validation</a></li>
</ul></li>
<li><a href="#end-to-end-machine-learning-project"><span class="toc-section-number">2</span> End-to-End Machine Learning Project</a></li>
</ul>
</nav>
<p>Machine Learning Topics</p>
<h1 data-number="1" id="the-machine-learning-landscape"><span class="header-section-number">1</span> The Machine Learning Landscape</h1>
<h2 data-number="1.1" id="types-of-machine-learning-systems"><span class="header-section-number">1.1</span> Types of Machine Learning Systems</h2>
<h3 data-number="1.1.1" id="supervised-vs-unsupervised"><span class="header-section-number">1.1.1</span> Supervised vs Unsupervised</h3>
<ul>
<li><p><strong>Supervised Learning</strong><br />
The training set you feed to the algorithm includes the desired solutions, called <em>labels</em>.</p></li>
<li><p><strong>Unsupervised Learning</strong><br />
The training set is unlabeled. The system tries to learn without a teacher</p></li>
<li><p><strong>Semi-supervised Learning</strong><br />
The algorithms can deal with data that’s partially labeled. Most of these types of algorithms are combinations of unsupervised and supervised algorithms</p></li>
<li><p><strong>Reinforcement Learning<br />
</strong>The learning system (<em>agent</em>) can observe the environment, select and perform actions, and get <em>rewards</em> or <em>penalties</em> in return. It must then learn by itself what is the best strategy, called a <em>policy</em>, to get the most reward over time. A policy defines what action the agent should choose when it is in a given situation.</p></li>
</ul>
<h3 data-number="1.1.2" id="batch-and-online-learning"><span class="header-section-number">1.1.2</span> Batch and Online Learning</h3>
<ul>
<li><p><strong>Batch Learning</strong><br />
The system is incapable of learning incrementally: it must be trained using all the available data, usually done offline, and then once the model is trained, it is then launched into production and runs without learning anymore (<em>offline learning</em>)</p></li>
<li><p><strong>Online Learning</strong><br />
You train the system incrementally by feeding it data instances sequentially, either individually or in small groups called <em>mini batches</em>. Each learning step is fast and cheap, so the system can learn about new data on the fly, as it arrives.</p>
<ul>
<li><p>Great for systems that receive data as a continuous flow (e.g., stock prices) and need to adapt to change rapidly or autonomously.</p></li>
<li><p>Also good with limited computing resources: once an online learning system has learned about new data instances, it does not need them anymore and you can discard them.</p></li>
<li><p>Online learning algorithms can be used to train systems on huge datasets that cannot fit in one machine’s main memory (<em>out-of-core learning</em>).</p></li>
<li><p>One important parameter of online learning systems is how fast they should adapt to changing data (<em>learning rate</em>)</p></li>
<li><p>If bad data is fed to the system, the system’s performance will gradually decline.</p></li>
</ul></li>
</ul>
<h3 data-number="1.1.3" id="instance-based-vs.-model-based-learning"><span class="header-section-number">1.1.3</span> Instance-Based vs. Model-Based learning</h3>
<p>How do machine learning systems <em>generalize</em>?</p>
<ul>
<li><p><strong>Instance-based learning</strong><br />
The system learns the examples by heart, then generalizes to new cases by using a similarity measure to compare them to the learned examples (or a subset).</p></li>
<li><p><strong>Model-based learning<br />
</strong>Build a model of these examples and then use that model to make <em>predictions</em>.</p>
<ul>
<li><p>The model takes parameters.</p></li>
<li><p>To determine how you can know which values make your model perform best, you need to specify a performance measure.</p>
<ul>
<li><p>Utility/fitness function measures how good your model is.</p></li>
<li><p>Cost function that measures how bad it is.</p></li>
</ul></li>
</ul></li>
</ul>
<h2 data-number="1.2" id="main-challenges-of-machine-learning"><span class="header-section-number">1.2</span> Main Challenges of Machine Learning</h2>
<ul>
<li><p>Insufficient Quantity of Training Data</p></li>
<li><p>Nonrepresentative Training Data</p></li>
<li><p>Poor Quality Data</p></li>
<li><p>Irrelevant Features</p></li>
<li><p>Overfitting</p></li>
<li><p>Underfitting</p></li>
</ul>
<h2 data-number="1.3" id="testing-and-validation"><span class="header-section-number">1.3</span> Testing and Validation</h2>
<p>Split data into two sets: <em>training</em> and <em>test</em> sets. The error rate on new cases is called the <em>generalization error</em> (or <em>out-of-sample error</em>), and by evaluating your model on the test set, you get an estimate of this error.</p>
<h1 data-number="2" id="end-to-end-machine-learning-project"><span class="header-section-number">2</span> End-to-End Machine Learning Project</h1>
</body>
</html>