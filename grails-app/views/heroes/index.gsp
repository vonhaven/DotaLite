<html>
    <head>
        <meta name="layout" content="main"/>
        <link rel="stylesheet" href="${resource(dir: 'css', file: 'hero.css')}" type="text/css"/>
    </head>
    <body>
        <g:each in="${heroes}">
            <div class="hero">
                <div class="name">${it.name}</div>
                <div class="portraitFrame"/>
                    <g:img class="portrait" dir="images" file="heroes/portraits/${it.name.replace(' ', '_')}.png"/>
                    <g:img class="primaryStat" dir="images" file="stats/${it.primaryStat}.png"/>
                </div>
                <g:img class="spell" dir="images" file="spells/icons/${it.q.name.replace(' ', '_')}.png"/>
                <g:img class="spell" dir="images" file="spells/icons/${it.w.name.replace(' ', '_')}.png"/>
                <g:img class="spell" dir="images" file="spells/icons/${it.e.name.replace(' ', '_')}.png"/>
                <g:img class="spell" dir="images" file="spells/icons/${it.r.name.replace(' ', '_')}.png"/>
                <div class="flavor">${it.flavor}</div>
            </div>
        </g:each>
    </body>
</html>
