<html>
    <head>
        <meta name="layout" content="main"/>
        <link rel="stylesheet" href="${resource(dir: 'css', file: 'game.css')}" type="text/css"/>
        <title>&gt;DotaLite: Fight!</title>
    </head>
    <body>
        <div id="gamePanel">
            <div class="panel" id="radiantPanel">
                <g:each in="${game.radiant.heroes}">
                    <div class="hero">
                        <g:img class="portrait" dir="images" file="heroes/portraits/${it.hero.name.replace(' ', '_')}.png"/>
                        <g:img title="${it.hero.q.name}: ${it.hero.q.description}" class="spell" dir="images" file="spells/icons/${it.hero.q.name.replace(' ', '_')}.png"/>
                        <g:img title="${it.hero.w.name}: ${it.hero.w.description}" class="spell" dir="images" file="spells/icons/${it.hero.w.name.replace(' ', '_')}.png"/>
                        <g:img title="${it.hero.e.name}: ${it.hero.e.description}" class="spell" dir="images" file="spells/icons/${it.hero.e.name.replace(' ', '_')}.png"/>
                        <g:img title="${it.hero.r.name}: ${it.hero.r.description}" class="spell" dir="images" file="spells/icons/${it.hero.r.name.replace(' ', '_')}.png"/>
                    </div>
                </g:each>
            </div>
            <div class="panel" id="infoPanel">
                <div class="info">
                    <div class="player">
                        Player 1
                        <div class="rank">
                            #113
                        </div>
                    </div>
                    <div class="player">
                        Player 2
                        <div class="rank">
                            #2404
                        </div>
                    </div>
                </div>
                <div class="info">
                    <div class="turnNumber">
                        Turn 3 
                    </div>
                    <div class="turnBar">
                        0:42:00
                    </div>
                </div>
                <div id="targetPanel">
                    <div id="targetStatus">
                        <g:img id="targetPortrait" dir="images" file="heroes/portraits/Anti-Mage.png"/>  
                        <div id="targetHealth">
                            <!--g:img id="targetCurrentHealth" dir="images" file="stats/health.png"-->
                        </div>
                        <div id="targetMana">
                            <!--g:img id="targetCurrentHealth" dir="images" file="stats/mana.png"-->
                        </div>
                        <g:img class="stat" dir="images" file="stats/STR.png"/>
                        <g:img class="stat" dir="images" file="stats/AGI.png"/>
                        <g:img class="stat" dir="images" file="stats/INT.png"/>
                    </div>
                </div>
            </div>
            <div class="panel" id="direPanel">
                <g:each in="${game.dire.heroes}">
                    <div class="hero">
                        <g:img class="portrait" dir="images" file="heroes/portraits/${it.hero.name.replace(' ', '_')}.png"/>
                        <g:img class="spell" dir="images" file="spells/icons/${it.hero.q.name.replace(' ', '_')}.png"/>
                        <g:img class="spell" dir="images" file="spells/icons/${it.hero.w.name.replace(' ', '_')}.png"/>
                        <g:img class="spell" dir="images" file="spells/icons/${it.hero.e.name.replace(' ', '_')}.png"/>
                        <g:img class="spell" dir="images" file="spells/icons/${it.hero.r.name.replace(' ', '_')}.png"/>
                    </div>
                </g:each>
            </div>
        </div>
        <canvas width="800" height="600"/>
    </body>
</html>
