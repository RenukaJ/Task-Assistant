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
        <g:javascript library="urlShortener" />
        <style>
            input[type=submit] {
            color:#08233e;
            font:2.4em Futura, ‘Century Gothic’, AppleGothic, sans-serif;
            font-size:70%;
            padding:14px;
            background:url(overlay.png) repeat-x center #ffcc00;
            background-color:rgba(255,204,0,1);
            border:1px solid #ffcc00;
            -moz-border-radius:10px;
            -webkit-border-radius:10px;
            border-radius:10px;
            border-bottom:1px solid #9f9f9f;
            -moz-box-shadow:inset 0 1px 0 rgba(255,255,255,0.5);
            -webkit-box-shadow:inset 0 1px 0 rgba(255,255,255,0.5);
            box-shadow:inset 0 1px 0 rgba(255,255,255,0.5);
            cursor:pointer;
            }
            input[type=submit]:hover {
            background-color:rgba(255,204,0,0.8);
            }
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>URL Shortener</title>
    </head>
    <body>

        <div id="header">
            <p style="text-align:center; margin-top:0px; margin-bottom:0px; padding:0px;">
                <img src="${resource(dir:'images',file:'urlShortenerHeader.png')}" style="width:950px;height:230px;" alt="header" />
            </p>
        </div>
        <div class="nav" role="navigation">
            <ul>
                <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
            </ul>
        </div>
        <div>
            Enter Long URL:
            <input id="longUrlId" type="text" name="LongURL" value="${longUrl}">
            <br>
            <input id="submitId"  type="submit" onClick= "processUrlTable();" value="Generate Short URL">
            <br>
            Shortened URL:
            <input id="shortUrlId" type="text" name="ShortURL" value="${shortUrl}">
            <br><br>
        </div>
        <table id="tbl_id" style="text-align:center" align="center" valign:"top">
               <thead>
                <tr>
                    <th>Long URL</th>
                    <th>Shortened URL</th>
                </tr>
            </thead>
        </table>
    </body>
</html>
<!--onClick= "processUrl();"-->