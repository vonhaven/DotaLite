<html>
    <head>
        <meta name="layout" content="main"/>
        <link rel="stylesheet" href="${resource(dir: 'css', file: 'hero.css')}" type="text/css"/>
    </head>
    <body>
        <g:each in="${heroes}">
            <div class="hero">
                <div class="name">${it.name}</div>
                <g:img class="portrait" dir="images" file="heroes/portraits/${it.name}.png"/>
                <div class="baseHealth">${it.baseHealth}</div>
                <div class="baseMana">${it.baseMana}</div>
                <div class="baseDamage">${it.baseDamage}</div>
                <div class="primaryStat">${it.primaryStat}</div>
            </div>
        </g:each>
    </body>
</html>
