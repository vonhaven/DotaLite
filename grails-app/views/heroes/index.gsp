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
                <g:img class="primaryStat" dir="images" file="stats/${it.primaryStat}.png"/>
                <div class="baseStats">${it.baseStrength}, ${it.baseAgility}, ${it.baseIntelligence}</div>
                <div>${spells}</div>
            </div>
        </g:each>
    </body>
</html>
