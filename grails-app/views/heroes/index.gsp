<html>
    <head>
        <meta name="layout" content="main"/>
        <link rel="stylesheet" href="${resource(dir: 'css', file: 'hero.css')}" type="text/css"/>
    </head>
    <body>
        <g:each in="${heroes}">
            <div class="hero">
                <div class="name">
                    ${it.name}
                </div>
                <g:img class="portrait" dir="images" file="heroes/portraits/${it.name.replace(' ', '_')}.png"/>
                <g:img class="spell" dir="images" file="spells/icons/${it.q.name.replace(' ', '_')}.png"/>
                <g:img class="spell" dir="images" file="spells/icons/${it.w.name.replace(' ', '_')}.png"/>
                <g:img class="spell" dir="images" file="spells/icons/${it.e.name.replace(' ', '_')}.png"/>
                <g:img class="spell" dir="images" file="spells/icons/${it.r.name.replace(' ', '_')}.png"/>
                <g:img class="stat" dir="images" file="stats/STR.png"/>
                <g:img class="stat" dir="images" file="stats/AGI.png"/>
                <g:img class="stat" dir="images" file="stats/INT.png"/>
            </div>
        </g:each>
    </body>
</html>
