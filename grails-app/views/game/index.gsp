<html>
    <head>
        <meta name="layout" content="main"/>
        <link rel="stylesheet" href="${resource(dir: 'css', file: 'game.css')}" type="text/css"/>
        <title>&gt;DotaLite: Fight!</title>
    </head>
    <body>
        <div id="gamePanel">
            <span id="radiantPanel">
                <g:each in="${game.radiant.heroes}">
                    <div class="hero">
                        <g:img class="portrait" dir="images" file="heroes/portraits/${it.hero.name.replace(' ', '_')}.png"/>
                        <g:img class="spell" dir="images" file="spells/icons/${it.hero.q.name.replace(' ', '_')}.png"/>
                        <g:img class="spell" dir="images" file="spells/icons/${it.hero.w.name.replace(' ', '_')}.png"/>
                        <g:img class="spell" dir="images" file="spells/icons/${it.hero.e.name.replace(' ', '_')}.png"/>
                        <g:img class="spell" dir="images" file="spells/icons/${it.hero.r.name.replace(' ', '_')}.png"/>
                    </div>
                </g:each>
            </span>
            <span id="infoPanel">
                Game Info
            </span>
            <span id="direPanel">
                <g:each in="${game.dire.heroes}">
                    <div class="hero">
                        <g:img class="portrait" dir="images" file="heroes/portraits/${it.hero.name.replace(' ', '_')}.png"/>
                        <g:img class="spell" dir="images" file="spells/icons/${it.hero.q.name.replace(' ', '_')}.png"/>
                        <g:img class="spell" dir="images" file="spells/icons/${it.hero.w.name.replace(' ', '_')}.png"/>
                        <g:img class="spell" dir="images" file="spells/icons/${it.hero.e.name.replace(' ', '_')}.png"/>
                        <g:img class="spell" dir="images" file="spells/icons/${it.hero.r.name.replace(' ', '_')}.png"/>
                    </div>
                </g:each>
            </span>
        </div>
        <canvas width="800" height="600"/>
    </body>
</html>
