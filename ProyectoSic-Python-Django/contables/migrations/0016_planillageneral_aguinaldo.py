# -*- coding: utf-8 -*-
# Generated by Django 1.11.5 on 2017-11-30 16:25
from __future__ import unicode_literals

import django.core.validators
from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('contables', '0015_auto_20171130_0936'),
    ]

    operations = [
        migrations.AddField(
            model_name='planillageneral',
            name='aguinaldo',
            field=models.DecimalField(decimal_places=2, max_digits=50, null=True, validators=[django.core.validators.MinValueValidator(0)], verbose_name='Aguinaldo'),
        ),
    ]
