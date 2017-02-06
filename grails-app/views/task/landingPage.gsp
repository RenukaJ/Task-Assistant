<!--
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
-->

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
    <head>
        <meta name="layout" content="main">
        <g:javascript>
            window.appContext = '${request.contextPath}';
        </g:javascript>
        <style>
            .wrapper {
            text-align: center;
            }
            .button {
            display: inline-block;
            border-radius: 4px;
            background-color: #FFFFFF;
            border: none;
            color: #000000;
            text-align: center;
            font-size: 28px;
            padding: 20px;
            width: 200px;
            transition: all 0.5s;
            cursor: pointer;
            margin: 40px;
            }

            .button span {
            cursor: pointer;
            display: inline-block;
            position: relative;
            transition: 0.5s;
            }

            .button span:after {
            content: '»';
            position: absolute;
            opacity: 0;
            top: 0;
            right: -20px;
            transition: 0.5s;
            }

            .button:hover span {
            padding-right: 25px;
            }

            .button:hover span:after {
            opacity: 1;
            right: 0;
            }
        </style>
        <g:javascript library="urlShortener" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>URL Shortner</title>
    </head>
    <body>
        <div id="header">
            <p style="text-align:center; margin-top:0px; margin-bottom:0px; padding:0px;">
                <img src="${resource(dir:'images',file:'headerGrails.png')}" style="width:950px;height:230px;" alt="header" />
            </p>
        </div>
<!--
        <g:link controller="task" action="displayURLPage"> <div class="img-shortner"> <img src="${resource(dir:'images',file:'urlshortner.png')}" alt="header" /></div> </g:link>
        <g:link controller="task" action="index"> <img src="${resource(dir:'images',file:'todo.jpg')}" alt="header" /> </g:link>
        -->
        <br>

        <div class="wrapper">
            <button class="button" style="vertical-align:middle"><span> <g:link controller="task" action="index"> <img src="${resource(dir:'images',file:'todo.jpg')}" alt="header" /> </g:link> </span></button>
            <button class="button" style="vertical-align:middle"><span> <g:link controller="task" action="displayURLPage"> <img src="${resource(dir:'images',file:'urlshortner.png')}" alt="header" /> </g:link> </span></button>
        </div>
    </body>
</html>