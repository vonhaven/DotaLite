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
                <div class="attr strength">
                    ${it.baseStrength}
                </div>
                <div class="attr agility">
                    ${it.baseAgility}
                </div>
                <div class="attr intelligence">
                    ${it.baseIntelligence}
                </div>
                <div class="stat leftStat damage">
                    ${it.baseDamage}
                </div>
                <div class="stat leftStat armor">
                    ${it.baseArmor}
                </div>
                <div class="stat rightStat attackSpeed">
                    ${it.baseAttackSpeed}
                </div>
                <div class="stat rightStat movementSpeed">
                    ${it.baseMovementSpeed}
                </div>
            </div>
        </g:each>
    </body>
</html>
